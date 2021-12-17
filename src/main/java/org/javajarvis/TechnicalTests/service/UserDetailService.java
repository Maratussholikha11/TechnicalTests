package org.javajarvis.TechnicalTests.service;

import org.javajarvis.TechnicalTests.model.User;
import org.javajarvis.TechnicalTests.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findByUsername(s)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format("User with email '%s' not found", s )));

    }

    public List<User>getAll(){
        return userRepository.findAll();
    }

    public User save (User user){
        boolean userExist = userRepository.findByUsername(user.getUsername()).isPresent();
        if (userExist){
            throw new RuntimeException(String.format("user with username '%s' is present", user.getUsername()));
        }

        String encodePassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        return userRepository.save(user);

    }

}
