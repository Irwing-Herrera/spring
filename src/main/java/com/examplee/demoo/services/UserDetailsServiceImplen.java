package com.examplee.demoo.services;

import com.examplee.demoo.models.ApplicationUser;
import com.examplee.demoo.repositories.ApplicationUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImplen implements UserDetailsService {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    // Cuando un usuario intenta autenticarse, este método recibe el nombre de usuario, 
    // busca en la base de datos un registro que lo contenga y (si se encuentra) devuelve una 
    // instancia de User. 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(applicationUser.getUsername(), applicationUser.getPassword(), emptyList());
    }

    public void setToken(String username, String token) {
        ApplicationUser user = applicationUserRepository.findByUsername(username);
        user.setToken(token);
        applicationUserRepository.save(user);
    }
}