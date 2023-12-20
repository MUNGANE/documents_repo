package Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Controller
public class Practice {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Nikita Mungane");
		model.addAttribute("id",1234);
		List<String> friends = new ArrayList<String>();
		friends.add("Nikita");
		friends.add("Nikhil");
		friends.add("Dhanajay");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	// this is another way to transfer data from controller to view using modelAndview onject
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndview = new ModelAndView();
		modelAndview.addObject("name", "Nikita");
		modelAndview.setViewName("help");
		return modelAndview;
		
	}

}
