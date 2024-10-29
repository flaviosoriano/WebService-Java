package com.FlavioSoriano.WebServices.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlavioSoriano.WebServices.entitites.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "", "", "");
		return ResponseEntity.ok().body(u);
	}
	
}
