package com.samuelamom.login_control.config;

import com.samuelamom.login_control.entity.User;
import com.samuelamom.login_control.ropository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                userRepository.save(new User("admin", passwordEncoder.encode("123456"), "ADMIN"));
                System.out.println("✅ Usuário ADMIN criado");
            }

            if (userRepository.findByUsername("cliente").isEmpty()) {
                userRepository.save(new User("cliente", passwordEncoder.encode("123456"), "CLIENT"));
                System.out.println("✅ Usuário CLIENT criado");
            }
        };
    }
}
