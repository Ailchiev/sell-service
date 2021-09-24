package com.example.demo.mapper;

import com.example.demo.models.dto.UserDto;
import com.example.demo.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUser (UserDto userDto);

    UserDto mapToUserDto(User user);
}
