package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//이 인터페이스가 dao라고 불리는 dbLayer 접근자
//JPA에서는 Repository라고 부른다.
//@Repository만들 필요 없다. Entity와 Repository는 늘 함께 위치
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
