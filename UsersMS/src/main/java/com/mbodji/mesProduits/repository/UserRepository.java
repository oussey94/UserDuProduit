package com.mbodji.mesProduits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbodji.mesProduits.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
