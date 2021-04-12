package com.mbodji.mesProduits.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbodji.mesProduits.entities.Role;
import com.mbodji.mesProduits.entities.User;
import com.mbodji.mesProduits.repository.RoleRepository;
import com.mbodji.mesProduits.repository.UserRepository;
@Service
@Transactional
public class CompteServiceImplementation implements CompteService {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	

	public CompteServiceImplementation(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Role addNewRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// TODO Auto-generated method stub
		User user=userRepository.findByUsername(username);
		Role role=roleRepository.findByRoleName(roleName);
		user.getRoles().add(role);
		
	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
