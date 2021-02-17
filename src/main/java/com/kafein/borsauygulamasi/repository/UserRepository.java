package com.kafein.borsauygulamasi.repository;

import java.util.Optional;

import com.kafein.borsauygulamasi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}
