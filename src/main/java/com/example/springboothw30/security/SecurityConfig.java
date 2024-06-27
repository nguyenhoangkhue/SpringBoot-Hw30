package com.example.springboothw30.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.authorizeHttpRequests(auth->{
            auth.requestMatchers("/").permitAll();
            auth.requestMatchers("/dashboard").hasAnyRole("ROLE_ADMIN","ROLE_SALE");
            auth.requestMatchers("/api/users/**").hasRole("ADMIN");
            auth.requestMatchers("/api/categories/**").hasAnyRole("ROLE_ADMIN","ROLE_SALE");
            auth.requestMatchers("/api/products/**").hasAnyRole("ROLE_ADMIN","ROLE_SALE");
            auth.requestMatchers("/api/brands/**").hasAnyRole("ROLE_ADMIN","ROLE_SALE");
            auth.requestMatchers("/api/order/**").hasAnyRole("ROLE_ADMIN","ROLE_SALE");
            auth.requestMatchers("/api/posts/**").hasAnyRole("ROLE_ADMIN","ROLE_SALE","ROLE_AUTHOR");
            auth.anyRequest().authenticated();
        });

        http.formLogin(form->{
            form.defaultSuccessUrl("/",true);
            form.permitAll();
        });

        http.logout(logout->{
            logout.logoutSuccessUrl("/");
            logout.invalidateHttpSession(true);
            logout.deleteCookies("JSESSIONID");
            logout.clearAuthentication(true);
            logout.permitAll();
        });

        return http.build();
    }
}
