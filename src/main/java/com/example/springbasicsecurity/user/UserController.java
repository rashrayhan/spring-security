package com.example.springbasicsecurity.user;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@AllArgsConstructor
public class UserController {

    UserService userService;


    @GetMapping("{id}")
    public UserResponse getUser(@PathVariable("id") Long id) throws NotFoundException {
        return userService.getUser(id);
    }

}
