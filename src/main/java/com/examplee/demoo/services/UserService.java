package com.examplee.demoo.services;

import java.util.ArrayList;
import java.util.List;

import com.examplee.demoo.models.Usuario;
import com.examplee.demoo.repositories.IUsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private IUsuarioRepo repo;

    // Datos de Usuario
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario us = repo.findByNombre(username);

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new  SimpleGrantedAuthority("ADMIN"));
        
        UserDetails details = new User(us.getNombre(), us.getClavev(), roles);
        return details;
    }
    
}