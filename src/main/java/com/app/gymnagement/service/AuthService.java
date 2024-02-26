package com.app.gymnagement.service;

import com.app.gymnagement.payload.LoginDto;
import com.app.gymnagement.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
