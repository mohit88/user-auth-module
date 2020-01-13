package com.mohit88.userauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit88.userauth.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
