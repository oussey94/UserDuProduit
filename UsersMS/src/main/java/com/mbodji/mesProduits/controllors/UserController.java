package com.mbodji.mesProduits.controllors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mbodji.mesProduits.entities.Role;
import com.mbodji.mesProduits.entities.User;
import com.mbodji.mesProduits.repository.UserRepository;
import com.mbodji.mesProduits.services.CompteService;

import lombok.Data;

@RestController
@CrossOrigin("*")
//@RequestMapping("/mb")
public class UserController {
	private CompteService compteService;
	
	public UserController(CompteService compteService) {
		super();
		this.compteService = compteService;
	}
	@GetMapping(path="/users")
	public List<User> appUsers(){
		return compteService.listUsers();
	}
	@GetMapping(path="/users/{username}")
	public User getByUername(@PathVariable("username") String username) {
		return compteService.findUserByUsername(username);
	}
	@PostMapping(path = "/users")
	public User saveUser(@RequestBody User user) {
		return compteService.addNewUser(user);
	}
	@PostMapping(path = "/roles")
	public Role saveRole(@RequestBody Role role) {
		return compteService.addNewRole(role);
	}
	@PostMapping(path = "/addRoleToUser")
	public void addRoleToUser(@RequestBody AddRoleUser addRoleUser) {
		compteService.addRoleToUser(addRoleUser.getUsername(), addRoleUser.getRoleName());
		
	}

}

@Data
class AddRoleUser{
	private String username;
	private String roleName;
}
