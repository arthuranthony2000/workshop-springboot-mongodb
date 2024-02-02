package com.arthuranthony.workshopmongo.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthuranthony.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	public List<User> findAll(){
		User maria = new User("1", "Maria Silva", "maria@gmail.com");
	}
}
