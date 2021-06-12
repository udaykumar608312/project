package com.project.springboot.controller;

import java.util.List;

//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.entity.Users;
import com.project.springboot.exception.ResourceNotFound;
import com.project.springboot.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
		
	@Autowired
	private  UserRepository userRepository;
		// get all users
	@GetMapping
	public List<Users> GetAllUsers(){
		return this.userRepository.findAll();
	}
		// get user by id
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable(value="id") long userId) {
		return this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFound("user not found with ID:"+userId));
	}
		
	
		// create user 
	
	@PostMapping
	public Users creatUser (@RequestBody Users user) {
		return this.userRepository.save(user);
	}
		// update user
	
	@PutMapping("/{id}")
	public Users updateUser(@RequestBody Users user,@PathVariable("id") long userId) {
		Users existingUser=this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFound("user not found with ID:"+userId));
		existingUser.setFirst_Name(user.getFirst_Name());
		existingUser.setLast_Name(user.getLast_Name());
		existingUser.setBlood_grp(user.getBlood_grp());
		existingUser.setAddress(user.getAddress());
		existingUser.setDept(user.getDept());
		existingUser.setDesignation(user.getDesignation());
		existingUser.setEmp_id(user.getEmp_id());
		existingUser.setId(user.getId());
		existingUser.setStatus(user.getStatus());
		existingUser.setGender(user.getGender());
		existingUser.setRep_Mgr(user.getRep_Mgr());
		return this.userRepository.save(existingUser);
		
	}
		// delete user
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Users> deletUser(@PathVariable("id") long userId){
		Users existingUser=this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFound("user not found with ID:"+userId));
		this.userRepository.delete(existingUser);
		return ResponseEntity.ok().build();
	}
		
	}

