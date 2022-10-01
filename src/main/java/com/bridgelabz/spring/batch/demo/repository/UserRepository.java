package com.bridgelabz.spring.batch.demo.repository;

import com.bridgelabz.spring.batch.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
}
