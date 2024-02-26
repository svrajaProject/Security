package com.app.gymanagement.service;

import com.app.gymanagement.payload.LoginDto;
import com.app.gymanagement.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
