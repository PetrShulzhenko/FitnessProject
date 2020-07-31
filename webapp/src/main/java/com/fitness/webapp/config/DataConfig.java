package com.fitness.webapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableJdbcRepositories
public class DataConfig extends AbstractJdbcConfiguration {
    private static final String PROP_DATABASE_DRIVER = "dbDriver";
    private static final String PROP_DATABASE_URL = "dbUrl";
    private static final String PROP_DATABASE_USERNAME = "dbUsername";
    private static final String PROP_DATABASE_PASSWORD = "dbPassword";
    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(env.getProperty(PROP_DATABASE_URL));
        driverManagerDataSource.setDriverClassName(Objects.requireNonNull(env.getProperty(PROP_DATABASE_DRIVER)));
        driverManagerDataSource.setUsername(env.getProperty(PROP_DATABASE_USERNAME));
        driverManagerDataSource.setPassword(env.getProperty(PROP_DATABASE_PASSWORD));
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate template() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
