package xyz.myzsl.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "xyz.myzsl.member.dao")
@EnableDiscoveryClient
public class SlxueMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlxueMemberApplication.class, args);
    }

}
