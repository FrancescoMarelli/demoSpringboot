package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
public class CreandoConexion {
    @Bean(name = "beanUsuario")
    public Usuario getUsuario() {
        return new Usuario();
    }

    @Bean(name = "beanConexion")
    public Conexion getConexion() {
        Conexion conexion = new Conexion();
        conexion.setDb("mysql");
        conexion.setUrl("localhost");
        return conexion;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb/parametrodelauri?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
