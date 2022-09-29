package com.luizmangerotte.eventproject.services;

import com.luizmangerotte.eventproject.model.UserModel;
import com.luizmangerotte.eventproject.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserModelService {

    List<UserDto> findAll();
    Optional<UserDto> findById(Long id);
    UserModel insert(UserDto userDto);
    void delete(Long id);
    UserDto update(Long id, UserDto userDto);
    void updateData();

}
