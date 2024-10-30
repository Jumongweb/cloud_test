package com.jumong.cloud_test.service;

import com.jumong.cloud_test.dtos.request.RegisterRequest;
import com.jumong.cloud_test.dtos.response.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest registerRequest);



}
