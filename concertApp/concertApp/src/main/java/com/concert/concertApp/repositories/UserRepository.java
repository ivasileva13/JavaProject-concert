package com.concert.concertApp.repositories;

import com.concert.concertApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    // User findUserByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.email = :email")
    User fetchByEmail(String email);
}
