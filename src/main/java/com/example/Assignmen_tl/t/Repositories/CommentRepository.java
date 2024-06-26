package com.example.Assignmen_tl.t.Repositories;

import com.example.Assignmen_tl.t.Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    @Override
    List<Comment> findAll();
}
