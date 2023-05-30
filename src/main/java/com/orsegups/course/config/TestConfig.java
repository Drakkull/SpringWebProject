package com.orsegups.course.config;

import com.orsegups.course.entities.User;
import com.orsegups.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Kratos","klebi@gmail.com", "66666", "xast1");
        User u2 = new User(null, "Pit", "pituca@gmail.com", "2345678","1234");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}