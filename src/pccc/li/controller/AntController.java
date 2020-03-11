package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AntController {

	/*
	 * springMVC 支持Ant方式的请求路径
	 * 在Ant中有3中匹配符
	 * *：任意字符
	 * ?:任意一个字段
	 * **：任意多层目录
	 */
	
	//表示的含义 在前面加上任意字符
	//可以这样请求  http://localhost:8080/SpringMVC/adc/testAnt"
	//adc 可以换成任意字符
	@RequestMapping(value="/*/testAnt")
	public String testAnt(){
		
		return "success";
	}
	/*
	 * ？相当于占位符
	 * 表示可以用antMM或者antJJ或者antss访问
	 * 可以这样请求  http://localhost:8080/SpringMVC/antss/testAnt"
	 */
	
	@RequestMapping(value="/ant?/testAnt")
	public String testAnt1(){
		
		return "success";
	}
	/*
	 * ** 表示多级目录
	 * 可以这样请求  http://localhost:8080/SpringMVC/a/d/c/testAnt"
	 */
	@RequestMapping(value="/**/testAnt")
	public String testAnt2(){
		
		return "success";
	}
	
}
