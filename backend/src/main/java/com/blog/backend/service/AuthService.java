package com.blog.backend.service;

import com.blog.backend.dto.auth.AuthResponse;
import com.blog.backend.dto.auth.LoginRequest;
import com.blog.backend.dto.auth.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}