package com.han.cloud.controller;

import com.han.cloud.entity.User;
import com.han.cloud.repository.UserRepositorry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author hanyf
 * @Date 2018\11\4 0004 14:12
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserRepositorry userRepositorry;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> byId = this.userRepositorry.findById(id);
        return byId.orElseGet(null);
    }
}
