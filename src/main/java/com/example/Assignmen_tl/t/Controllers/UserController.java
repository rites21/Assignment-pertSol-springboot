package com.example.Assignmen_tl.t.Controllers;

import com.example.Assignmen_tl.t.Models.Comment;
import com.example.Assignmen_tl.t.Models.User;
import com.example.Assignmen_tl.t.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/comments")
    public List<Comment> getAllComment(){
        return userService.getAllComments();
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
       return userService.addUser(user);
    }

//    @PostMapping("/comments")
//    public String updateComment(@RequestBody Comment comment){
//        return null;
//    }
}
