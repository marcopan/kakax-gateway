package com.nongfu.kakaxgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pan
 */
@SpringBootApplication
@EnableEurekaClient
public class KakaxGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KakaxGatewayApplication.class, args);
    }

}
