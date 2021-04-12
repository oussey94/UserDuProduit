package com.mbodji.mesProduits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbodji.mesProduits.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRoleName(String roleName);

}
