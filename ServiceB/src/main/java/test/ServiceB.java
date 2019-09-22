package test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.swing.*;

@SpringBootApplication
@EnableEurekaClient
public class ServiceB {
    public static  void  main(String[] args){
        SpringApplication.run(ServiceB.class, args);
    }
}
