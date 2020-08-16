document.getElementById("login-form").addEventListener('submit',changePassword);

function changePassword(e) {
    e.preventDefault();

    var password = document.getElementById("newPassword").value;
    var params = "newPassword=" + password; 

    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://localhost:8080/reset_password', true);
    xhr.setRequestHeader('Content-type','application/x-www-form-urlencoded');

    xhr.onload = function(){
        if( (this.status == 200) && (JSON.parse(this.responseText) == true) ) {
            alert("Ваш пароль успешно изменен :)");
            window.location.href = "./login.html";
        }
        else {
            alert("Что-то пошло не так..");
        }
    }

    xhr.send(params);
}