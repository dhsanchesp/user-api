package com.userapi.application.controller;

import com.userapi.domain.model.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserModel> getUser() {
        return ResponseEntity.ok(UserModel.builder()
                        .name("Daniel")
                        .surname("Sanches")
                        .nickname("Buffalo")
                .build());
    }
}
