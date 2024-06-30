package com.example.login_practice.service;

import ch.qos.logback.core.model.Model;
import com.example.login_practice.dto.RegisterDTO;
import com.example.login_practice.entity.RegisterEntity;
import com.example.login_practice.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Register_Service {

    @Autowired
    private RegisterRepository registerRepository;

    public boolean isUsernameTaken(String username) {
        return registerRepository.findByUsername(username).isPresent();
    }

    public void registerUser(RegisterEntity user) {
        registerRepository.save(user);
    }
}
