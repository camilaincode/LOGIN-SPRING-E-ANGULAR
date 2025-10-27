package com.example.backend.services;

import com.example.backend.dto.CredencialDto;
import com.example.backend.dto.UserDto;
import com.example.backend.entities.User;
import com.example.backend.exceptions.AppException;
import com.example.backend.mappers.UserMapper;
import com.example.backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final UserMapper mapper;

    public UserDto login(CredencialDto dto){
       User user = repository.findByLogin(dto.login())
                .orElseThrow(() -> new AppException("Unknown user", HttpStatus.NOT_FOUND));

        if(encoder.matches(CharBuffer.wrap(dto.password()),user.getPassword())){
            return mapper.toUserDto(user);
        }
        throw new AppException("invalid password", HttpStatus.BAD_REQUEST);
    }

}
