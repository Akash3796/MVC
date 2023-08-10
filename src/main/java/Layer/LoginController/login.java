package Layer.LoginController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Layer.Entities.Entities;

@Controller
public class login {
	
	@RequestMapping("/login")
	public String select(@RequestParam String username, @RequestParam String password, HttpSession Session,
			Model m) {
		
				if (username.equals(password)) {
					
						Session.setAttribute("user", username);
						
				} else {
								m.addAttribute("errlog", "Invalid Credientional..");
								return "login";
				}
		
		return "home";
	};
}
