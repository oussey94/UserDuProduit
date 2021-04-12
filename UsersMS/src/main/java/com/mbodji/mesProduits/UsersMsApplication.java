package com.mbodji.mesProduits;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mbodji.mesProduits.entities.Role;
import com.mbodji.mesProduits.entities.User;
import com.mbodji.mesProduits.services.CompteService;

@SpringBootApplication
public class UsersMsApplication implements CommandLineRunner {
	private CompteService compteService;
	

	public UsersMsApplication(CompteService compteService) {
		super();
		this.compteService = compteService;
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		compteService.addNewRole(new Role(null,"USER"));
		compteService.addNewRole(new Role(null,"ADMIN"));
		
		compteService.addNewUser(new User(null,"oussey","oussey94",true, new ArrayList<>()));
		compteService.addNewUser(new User(null,"safietou","safietou01",true, new ArrayList<>()));
		compteService.addNewUser(new User(null,"amy","amy95",false, new ArrayList<>()));
		
		compteService.addRoleToUser("oussey", "ADMIN");
		compteService.addRoleToUser("oussey", "USER");
		compteService.addRoleToUser("safietou", "ADMIN");
		compteService.addRoleToUser("amy", "USER");
		*/
	}

}
