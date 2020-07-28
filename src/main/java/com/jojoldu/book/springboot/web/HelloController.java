package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //1.컨트롤러를 JSON을 반환하는 컨트롤러로 만듬, 예전에 매 메소드마다 ResponseBody를 사용하던걸 대체함
public class HelloController {

    @GetMapping("/hello") //2.HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다. @RequestMapping(method = RequestMethod.GET)사용 대체
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
    //외부에서 api로 넘긴 파라미터를 가져오는 어노테이션, name이란 이름으로 넘긴 파라미터를 메소드 파라미터에 저장하게 된다.
        return new HelloResponseDto(name, amount);
    }

}
