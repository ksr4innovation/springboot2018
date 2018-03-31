package com.snkit.springboot.marchspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	@Qualifier("premiumUserService")
	private UserAbstractService userTest;
	
	
	@Autowired
	@Qualifier("userService")
	private UserAbstractService userAbstractService2;
	
	@GetMapping	(value="greeting",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public User getMessage() {
		
		return new User("ABC","XYZ","Hyd");
		
	}
	
	@PostMapping(value="addPreUser",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public void addPreUser(@RequestBody User user) {
		userTest.addUser(user);
	}
	
	@PostMapping(value="addUser",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public void addUser(@RequestBody User user) {
		userAbstractService2.addUser(user);
	}
	@GetMapping(value="addPreUser",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public UserResp  getPreUser() {
		return userTest.getUser();
	}
	
	@GetMapping(value="addUser",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public UserResp getNorUser() {
		return userAbstractService2.getUser();
	}
}
