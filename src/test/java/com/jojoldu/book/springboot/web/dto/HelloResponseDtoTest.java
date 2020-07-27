package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        //assertThat 은 assertj라는 테스트 검증 라이브러리의 검증 메소드
        //검증하고 싶은 대상을 메소드로 받는다.
        //isEqualTo 는 assertj의 동등 비교 메소드이다. assertThat에 있는 값과 isEqualTo를 비교해 같으면 성공
    }
}
