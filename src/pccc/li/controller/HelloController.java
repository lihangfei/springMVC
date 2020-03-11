package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/*
	 * RequestMapping 映射方法名  在jsp页面调用方法名 即可调用Controller页面的方法
	 * RequestMapping 可以放在类上面 也可以放在方法名上面
	 */
	@RequestMapping("test")
	public String test(){
		
		System.out.println("success");
		
		return "success";
	}
	
	@RequestMapping("testTwo")
	public String success(){
		
		System.out.println("success");
		
		return "success";
	}
}
