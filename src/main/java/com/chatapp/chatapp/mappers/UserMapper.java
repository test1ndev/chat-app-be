package com.chatapp.chatapp.mappers;

import com.chatapp.chatapp.dto.UserDTO;
import com.chatapp.chatapp.models.User;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Component
@Mapper(componentModel = "Spring")
public interface UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDtoToEntity(UserDTO userDTO);
}
