

package com.Flight_Reservation_app_7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_Reservation_app_7.entity.User;
import com.Flight_Reservation_app_7.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	//http://localhost:8080/plane
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}

	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user,Model model) {
		userRepo.save(user);
		model.addAttribute("msg", "data is saved");
		return "login/login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") String password,
			Model model) {
		User user = userRepo.findByEmail(emailId);
		if (user != null) {
			if (user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
				return "findFlight";
			} else {
				model.addAttribute("error","invalid username/password");
				return "login/login";
			}
		} else {
			model.addAttribute("error","invalid username/password");
			return "login/login";
		}
	}
}

