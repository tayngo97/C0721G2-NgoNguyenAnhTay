package com.example.demo.repo;

import com.example.demo.bean.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepo extends JpaRepository<Question,Integer> {
    @Query(value="select * from Question q where q.title like %:keyword% or q.answer like %:keyword% or q.status like %:keyword% or q.date_create like %:keyword%",nativeQuery=true)
    Page<Question> findByKeyWord(@Param("keyword")String keyword, Pageable pageable);
}
