package com.example.backend.controllers;

import com.example.backend.dto.CredencialDto;
import com.example.backend.dto.UserDto;
import com.example.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody CredencialDto credencialDto){
        UserDto user = userService.login(credencialDto);
        return ResponseEntity.ok(user);
    }
}
