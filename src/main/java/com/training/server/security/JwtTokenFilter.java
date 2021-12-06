package com.training.server.security;

import com.training.server.security.config.JwtProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author andy
 * @date 2021/12/2
 */
public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtProperties jwtProperties;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String bearerToken = request.getHeader(jwtProperties.getTokenHeader());

        if (bearerToken != null && !bearerToken.isEmpty() && bearerToken.startsWith(jwtProperties.getTokenStart())) {

        }

        filterChain.doFilter(request, response);

    }

}
