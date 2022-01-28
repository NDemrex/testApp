package com.gcu.business;

import org.springframework.stereotype.Service;

import com.gcu.model.LoginModel;

@Service
public class ValidLogins implements SecurityServiceInterface {

	@Override
	public boolean isAuthenticated(LoginModel loginModel) {

		System.out.println("ujbrgjnggggggggggggggggggggggggg");
		
		return true;
	}
}
