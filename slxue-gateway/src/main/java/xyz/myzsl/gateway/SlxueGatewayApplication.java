package xyz.myzsl.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SlxueGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlxueGatewayApplication.class, args);
    }

}
