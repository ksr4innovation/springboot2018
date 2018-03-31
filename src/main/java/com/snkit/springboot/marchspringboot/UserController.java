package com.snkit.springboot.marchspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping	(value="greeting",consumes= {"application/json","application/xml"},
			produces={"application/json","application/xml"})
	public User getMessage() {
		
		return new User("ABC","XYZ","Hyd");
		
	}
	
	

}
