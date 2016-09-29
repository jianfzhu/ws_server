package com.fancy.service.impl;

import javax.jws.WebService;

import com.fancy.service.HelloWorld;

@WebService
public class HellowWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hi " + name;
	}

}
