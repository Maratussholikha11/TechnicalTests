package com.example.tesprogrammer.repository;

import com.example.tesprogrammer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


    public Optional<User> findByUsername(String name);
    User findEmployeeByUsernameAndPassword(String username, String password);
}
