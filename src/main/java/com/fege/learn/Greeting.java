package com.fege.learn;

public class Greeting {

	long id;

	String name;

	public Greeting() {
	}

	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
}
