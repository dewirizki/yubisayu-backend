package com.bangkit.yubisayu.botani.controller;

import com.bangkit.yubisayu.botani.constants.ApiPath;
import com.bangkit.yubisayu.botani.model.entities.user.Users;
import com.bangkit.yubisayu.botani.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(ApiPath.USERS_ID)
    public Mono<Users> getCustomerById(@PathVariable String id) throws Exception {
        return userService.getUserById(id);
    }
}
