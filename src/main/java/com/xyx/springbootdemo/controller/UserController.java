package com.xyx.springbootdemo.controller;

import com.xyx.springbootdemo.entity.User;
import com.xyx.springbootdemo.mapper.UserMapper;
import com.xyx.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping
    public Integer save(@RequestBody User user){
        //新增或者更新
        return userService.save(user);
    }

    @GetMapping
    public List<User> index(){
        List<User> all = userMapper.findAll();
        return all;
    }
}
