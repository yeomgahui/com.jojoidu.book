package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//1. Application 클래스는 앞으로 만들 프로젝트의 메인 클래스이다.

@EnableJpaAuditing
@SpringBootApplication //2.이 어노테이션은 스프링부트의 자동 설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정함 이 어노테이션이 있는 위치로부터 설정을 읽어가기 때문에, 이 클래스는 항상 프로젝트의 최상단에 위치해야함
public class Application {
    public static void main(String[] args) {
        //3. SpringApplication.run은 내장 WAS를 실행함 톰캣설치 불필요.
        SpringApplication.run(Application.class, args);
    }
}


