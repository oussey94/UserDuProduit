package com.mbodji.mesProduits.services;

import java.util.List;

import com.mbodji.mesProduits.entities.Role;
import com.mbodji.mesProduits.entities.User;

public interface CompteService {
	User addNewUser(User user);
	Role addNewRole(Role role);
	void addRoleToUser(String username, String roleName);
	User findUserByUsername(String username);
	List<User> listUsers();

}
