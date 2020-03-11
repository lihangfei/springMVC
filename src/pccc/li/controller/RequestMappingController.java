package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {

	/*
	 * @requestMapping 有4个参数
	 * value 设置方法名
	 * 
	 * method 设置请求方式 get查  post改  put增  delete删
	 * 
	 * params 设置参数 
	 * 
	 * headers 请求头 用到的比较少
	 * 
	 * 这些参数相当于给请求添加约束，属性
	 */
	//表示 方法名为testRequestMapController  请求方式为 GET  一定要有参数userName字段否则访问不同。
	//可以这样请求  http://localhost:8080/SpringMVC/testRequestMapController?userName="诸葛亮"
	@RequestMapping(value="testRequestMapController",method=RequestMethod.GET,params={"userName","!age"})
	public String test(){
		
		return "success";
	}
	//这个表示请求体里面不能有age字段
	@RequestMapping(value="testRequestMapController",params={"userName","!age"})
	public String test1(){
		
		return "success";
	}
	//这个表示 请求中必须有userName字段 同时age必须等于12
	@RequestMapping(value="testRequestMapController",params={"userName","age=12"})
	public String test2(){
		
		return "success";
	}
	
	//这个表示 请求中必须有userName字段 同时age必须不等于12
	@RequestMapping(value="testRequestMapController",params={"userName","age!=12"})
	public String test3(){
		
		return "success";
	}
}
