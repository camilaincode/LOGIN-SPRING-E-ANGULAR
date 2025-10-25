package com.example.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MessagensController {
    @GetMapping("/messagens")
    public ResponseEntity<List<String>> messagens(){
        return ResponseEntity.ok(Arrays.asList("deusa","deus","unico","guardiões"));
    }
}
