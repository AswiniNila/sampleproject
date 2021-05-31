package com.cg.bts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bts.entities.User;
import com.cg.bts.service.UserService;

@RestController
public class UserController {

@Autowired
private UserService userservice;
@RequestMapping(value="/user/all", method=RequestMethod.GET)
public List<User>getAllUsers(){
	return userservice.getAllUsers();
}
@RequestMapping(value="/user/add user", method=RequestMethod.POST)
public User addUser(@RequestBody User newuser) {
	return userservice.addUser(newuser);
}		

@RequestMapping(value= "/user/update/{id}", method= RequestMethod.PUT)
public User updateUser(@RequestBody User upduser, @PathVariable long id) {
    Optional<User> user =  userservice.getUser(id);
    if (!user.isPresent()) {
                 System.out.println("Could not find user with id - " + id);
                 return new User();
    }
    else  {
                 upduser.setUserId(id);
                 return userservice.updateUser(upduser);
    }
}
}
