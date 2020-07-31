package com.fitness.webapp.controllers;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

import com.fitness.webapp.dao.AccException;
import com.fitness.webapp.model.IdsPair;
import com.fitness.webapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reset_password")
public class ResetPasswordController {
    private final UserService userService;
    private final String fromEmail = "pswresetforboreyko@gmail.com";
    private final String emailPassword = "1234567890wsxrfvyhnik,";
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Autowired
    public ResetPasswordController(UserService userService) {
        this.userService = userService;
    }

    private void send(String toEmail) {
        // relay.jangosmtp.net
        String host = "smtp.gmail.com";

        // SSL protocol is used
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, emailPassword);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(fromEmail));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));

            // Set Subject: header field
            message.setSubject("Reset password");

            // Now set the actual message
            message.setText("Follow the link to reset the password: http://localhost:8080/Login/Change-Password.html?login=" + toEmail);

            // Send message
            Transport.send(message);

            System.err.println("Reset message sent to " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @PostMapping
    public void sendResetEmail(@RequestBody String login) throws AccException {
        if (!userService.doesExist(login)) {
            throw new AccException("such user doesn't exist");
        }

        CompletableFuture.supplyAsync(() -> {
            send(login);
            return null;
        }, executorService);
    }

    // TODO: change return value to analog of Response
    @PutMapping
    public Boolean resetPassword(@RequestBody IdsPair idsPair) {
        return userService.updatePassword(idsPair);
    }
}
