package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {
	@RequestMapping("/login")
	public String loginPage() {
		return "loginpage";
	}
	@RequestMapping(path="/processform", method= RequestMethod.POST)
	public String processForm(@RequestParam(name="user-name", required=true) String username , @RequestParam("password") String password , Model model) {
		System.out.println("user name is" + username);
		System.out.println("password is" + password);
		
		model.addAttribute("name", username);
		model.addAttribute("pass", password);
		return "success";
	}

}
