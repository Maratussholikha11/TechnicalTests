package org.javajarvis.TechnicalTests.service;

import org.javajarvis.TechnicalTests.model.User;
import org.javajarvis.TechnicalTests.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        if(user.getId()!=null){
            User current = userRepository.findById(user.getId()).get();
            current.setName(user.getName());
            current.setAddress(user.getAddress());
            current.setEmail(user.getEmail());
            current.setCity(user.getCity());
            current.setPassword(user.getPassword());
            current.setUsername(user.getUsername());
            current.setCountry(user.getCountry());
            current.setPhone(user.getPhone());
            current.setPostcode(user.getPostcode());
            user = current;
        }
        return userRepository.save(user);
    }
    public User findOne(Integer id){
        Optional<User> u = userRepository.findById(id);
        if (!u.isPresent()){
            return null;
        }
        return u.get();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public  void  removeOne (Integer id){
        userRepository.deleteById(id);
    }

    }


