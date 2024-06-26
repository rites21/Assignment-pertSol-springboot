package com.example.Assignmen_tl.t.Services;

import com.example.Assignmen_tl.t.Models.Comment;
import com.example.Assignmen_tl.t.Models.User;
import com.example.Assignmen_tl.t.Repositories.CommentRepository;
import com.example.Assignmen_tl.t.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CommentRepository commentRepository;

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public User addUser(User user){
//        User user1 = new User();
//        user1.setUsername(user.getUsername());
//        user1.setComments(user.getComments());
//        user1.setEmail(user.getEmail());
//        user1.setCreatedAt(new Date());
//        user1.setLastModifiedAt(new Date());
        user.setCreatedAt(new Date());
        return userRepository.save(user);
    }

}
