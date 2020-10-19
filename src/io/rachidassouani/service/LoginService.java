package io.rachidassouani.service;

import io.rachidassouani.model.User;

public class LoginService {
	
	public boolean verifyLogin(User user) {
		if (user.getUserId().equals("userId") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}

}
