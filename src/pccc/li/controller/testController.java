package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class testController {

	@RequestMapping("world")
	public String test(){
		
		return "hello";
	}
}
