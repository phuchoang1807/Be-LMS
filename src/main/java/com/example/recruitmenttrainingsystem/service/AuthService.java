package com.example.recruitmenttrainingsystem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    public void login(String email) {
        logger.info("User attempting to login with email: {}", email);

        try {
            // xử lý login
            logger.info("Login successful for email: {}", email);
        } catch (Exception ex) {
            logger.error("Login failed for email: {}", email, ex);
            throw ex;
        }
    }
}
