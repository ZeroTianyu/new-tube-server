package com.newtube.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootApplication
@SpringBootTest
@Slf4j
class AuthApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}