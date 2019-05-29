package br.com.wiretecnologia.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("br.com.wiretecnologia")
@SpringBootApplication
public class ProjectLokiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectLokiApplication.class, args);
    }

}
