package com.snkit.springboot.marchspringboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserAbstractService{

	private Map<Integer,User> userMap = new HashMap<Integer,User>();
	@Override
	public void addUser(User user) {
		userMap.put(user.hashCode(), user);
		
	}
	@Override
	public UserResp getUser() {
		
		UserResp resp = new  UserResp();
		
		
		resp.setUserList(userMap.values());
		
		return resp;
	}

}

