package com.fernando.course.services;

import com.fernando.course.entities.UserEntity;
import com.fernando.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findall() {
        return repository.findAll();
    }

    public UserEntity findById(Long id) {
        Optional<UserEntity> user = repository.findById(id);
        return user.get();
    }
}
