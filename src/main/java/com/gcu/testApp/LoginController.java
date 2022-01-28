package com.gcu.testApp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.gcu.business.SecurityServiceInterface;
import com.gcu.model.LoginModel;

/*
 * all requests get processed by the /login 
 * does not work.
 * */
@Controller
public class LoginController {

	@Autowired
	SecurityServiceInterface securityService;

	@GetMapping("/")
	public String display(Model model) {
		// display the login view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}

	/*
	 * We will validate the login, we will run a T/F and see if we match the logins
	 * within the code. this would be a good spot for database input
	 */

	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {

		/*
		 * if (bindingResult.hasErrors()) { model.addAttribute("title", "Login Form");
		 * return "login"; }
		 */
		model.addAttribute("loginModel", loginModel);
		return "loginSuccess";
		/*
		 * if(securityService.isAuthenticated(loginModel)) { // login success, send a
		 * success message 
		 * 
		 *  } else { // we failed the login return "login"; }
		 */
	}
}
