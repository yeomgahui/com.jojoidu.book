package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//실제 db테이블과 매칭될 클래스 이 클래스는 Entity클래스라고 부른다.

@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity{
    @Id //해당 테이블의 PK필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙, GenerationType.IDENTITY옵션을 추가해야만 auto_increment(sequence)가 된다.
    private Long id;

    @Column(length = 500, nullable = false) //Varchar(255)가 기본값
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스 생성, 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
//Setter 메서드가 없는 경우,이걸 무작정 생성하면 해당 클래스의 인스턴스 값들이 언제 어디서 변해야 하는지
//코드상으로 명확하게 구분할 수가 없어, 차후 기능 변경시 어려워진다.
//Entity클래스에서 절대 Setter를 만들지 않는다!
//대신, 해당 필드의 값 변경이 필요하면 명확히 그 목적과 의도를 나타낼 수 있는 메소드를 추가해야 한다.
//db에 값을 어떻게 넣어줄까? 생성자를 통해 최종 값을 채운 후, db에 삽입하는 것! 값 변경이 필요한 경우 해당 이베느에 맞는 public 메소드 호출
//
