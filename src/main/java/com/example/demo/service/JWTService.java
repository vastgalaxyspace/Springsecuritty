package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

    public String generateToken() {

        Map<String,Object> claims=new HashMap<>();
        return Jwts.builder()
        .claims()
        .add(claims)
        .subject(username)
        .issuedAt(new Date(System.currentTimeMillis()))
        .expiration(new Date(System.currentTimeMillis()*60*60*30))
        .and()
        return " ";
    }
}
