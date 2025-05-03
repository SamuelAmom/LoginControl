package com.samuelamom.login_control.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samuelamom.login_control.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
