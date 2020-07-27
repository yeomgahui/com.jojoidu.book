package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//1. Application 클래스는 앞으로 만들 프로젝트의 메인 클래스이다.

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("man-test메인테스트");
        SpringApplication.run(Application.class, args);
    }
}


