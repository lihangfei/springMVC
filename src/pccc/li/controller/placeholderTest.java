package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class placeholderTest {

	/*
	 * 占位符
	 * {id}/username
	 * 需要在方法中用@PathVariable 绑定
	 */
	@RequestMapping("testPlaceHolder/{id}/{username}")
	public String test(@PathVariable("id")Integer id,@PathVariable("username")String name){
		System.out.println("id="+id+","+"username="+name);
		return "placeHolder";
	}
}
