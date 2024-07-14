package com.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class JavaConfig {
	@Bean
	public DriverManagerDataSource dmds() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("Rooh@#2001");
        return dataSource;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate  jdbctem() {
		NamedParameterJdbcTemplate jtp=new NamedParameterJdbcTemplate(dmds());
		
		return jtp;
	}
}
