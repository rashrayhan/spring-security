package com.example.springbasicsecurity.user;

import com.example.springbasicsecurity.security.SecurityConfig;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    public UserResponse getUser(Long id) throws NotFoundException {
       User user =  userRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found"));

       return UserResponse.builder()
               .user(user)
               .otherfields("this is other fields")
               .build();
    }
}
