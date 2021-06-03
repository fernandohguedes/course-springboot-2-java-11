package com.fernando.course.resources;

import com.fernando.course.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<UserEntity> findall() {
        return ResponseEntity.ok(new UserEntity(1L, "fernando", "fernando@foi.com.br", "3215654654", "Casa@2021"));
    }

}
