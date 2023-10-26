package com.nextracing.web.service;

import com.nextracing.web.dto.RegistrationDto;
import com.nextracing.web.models.User;

public interface UserService {

    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);

    User findByUsername(String username);
}
