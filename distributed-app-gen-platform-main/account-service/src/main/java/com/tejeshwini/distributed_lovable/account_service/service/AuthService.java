package com.tejeshwini.distributed_lovable.account_service.service;


import com.tejeshwini.distributed_lovable.account_service.dto.auth.AuthResponse;
import com.tejeshwini.distributed_lovable.account_service.dto.auth.LoginRequest;
import com.tejeshwini.distributed_lovable.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
