package io.rachidassouani.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import io.rachidassouani.model.User;
import io.rachidassouani.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven {
	
	private User user = new User();
	
	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "use id cannot be empty!");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "password cannot be empty!");
		}
	}
	
	public String execute() {
		
		LoginService loginService = new LoginService();	
		if (loginService.verifyLogin(user)) {
			return SUCCESS;
		}	
		return LOGIN;		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public Object getModel() {
		return user;
	}

}
