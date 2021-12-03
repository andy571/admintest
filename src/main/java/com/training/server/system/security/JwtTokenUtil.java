package com.training.server.system.security;

import com.training.server.system.security.config.JwtProperties;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * @author andy
 * @date 2021/12/1
 */
public class JwtTokenUtil implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);

    private JwtProperties jwtProperties;
//    @Value("${jwt.base64-secret}")
//    private String secret;
//    @Value("${jwt.expiration}")
//    private Long expiration;

    private Key key;
    private JwtParser jwtParser;

    @Override
    public void afterPropertiesSet() throws Exception {

        byte[] keyBytes = Decoders.BASE64.decode(jwtProperties.getBase64Key());
        key = Keys.hmacShaKeyFor(keyBytes);
        jwtParser = Jwts.parserBuilder()
                .setSigningKey(key)
                .build();
    }


    /**
     * 根据负责生成JWT的token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()

                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtProperties.getExpiration() * 1000))
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();
    }

    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = jwtParser
                .parseClaimsJws(token)
                .getBody();
        return claims;
    }



}
