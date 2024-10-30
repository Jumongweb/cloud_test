package com.jumong.cloud_test.service;

import com.jumong.cloud_test.data.model.User;
import com.jumong.cloud_test.data.repositories.UserRepository;
import com.jumong.cloud_test.dtos.request.RegisterRequest;
import com.jumong.cloud_test.dtos.response.RegisterResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        User newUser = new User();
        newUser.setEmail(registerRequest.getEmail());
        newUser.setPassword(registerRequest.getPassword());
        userRepository.save(newUser);
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setMessage("Registration successful");
        return registerResponse;
    }
}
