package com.priyanshu.distributed_lovable.account_service.service;


import com.priyanshu.distributed_lovable.account_service.dto.auth.AuthResponse;
import com.priyanshu.distributed_lovable.account_service.dto.auth.LoginRequest;
import com.priyanshu.distributed_lovable.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
