package com.luizmangerotte.eventproject.services.impl;

import com.luizmangerotte.eventproject.model.UserModel;
import com.luizmangerotte.eventproject.model.dto.UserDto;
import com.luizmangerotte.eventproject.repositories.UserModelRepository;
import com.luizmangerotte.eventproject.services.UserModelService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserModelServiceImpl implements UserModelService {


    private UserModelRepository userModelRepository;
    private ModelMapper modelMapper;


    @Override
    public List<UserDto> findAll() {
        return userModelRepository.findAll()
                .stream()
                .map(userModel -> modelMapper.map(userModel, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UserModel insert(UserDto userDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public void updateData() {

    }
}
