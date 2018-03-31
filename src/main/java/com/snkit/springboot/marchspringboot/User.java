package com.snkit.springboot.marchspringboot;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String desg;
	
	private String add;

	public User(String name, String desg, String add) {
		super();
		this.name = name;
		this.desg = desg;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	

}
