package com.example.backend.mappers;

import com.example.backend.dto.UserDto;
import com.example.backend.entities.User;
import org.mapstruct.Mapper;

//usado para mapear a entidade User com o User DTO
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}
