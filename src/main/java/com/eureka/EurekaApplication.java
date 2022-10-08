package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    /*
        https://progen.medium.com/load-balancing-spring-cloud-applications-using-eureka-and-spring-cloud-gateway-43d0bcf57cc3
        https://medium.com/javarevisited/how-to-use-spring-cloud-gateway-to-dynamically-discover-microservices-194c0c3869c6
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
