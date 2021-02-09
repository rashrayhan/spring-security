package com.example.springbasicsecurity;

import com.example.springbasicsecurity.user.User;
import com.example.springbasicsecurity.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class SpringBasicSecurityApplication {

    UserRepository userRepository;

    @PostConstruct
    public void prePersist() {
        List<User> users = Arrays.asList(
                new User(1L, "abdul", "pass1", "abdul@gmail.com"),
                new User(2L, "rasheed", "pass1", "rasheed@gmail.com"),
                new User(3L, "sewa", "pass1", "sewa@gmail.com"),
                new User(4L, "jaan", "pass1", "jaan@gmail.com")
        );

        userRepository.saveAll(users);

        log.info("user persisted {}", users);

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicSecurityApplication.class, args);
    }


}
