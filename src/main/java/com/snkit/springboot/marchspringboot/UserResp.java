package com.snkit.springboot.marchspringboot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class UserResp implements Serializable {
	
	Collection<User> userList = new ArrayList<User>();
	
	public UserResp() {
		
	}

	public Collection<User> getUserList() {
		return userList;
	}

	public void setUserList(Collection<User> userList) {
		this.userList = userList;
	}



	
}
