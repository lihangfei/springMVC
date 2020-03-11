package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class methodTest {

	/*
	 * 同名方法 请求限制
	 * get 和 post 好理解
	 * put和delete 没理解
	 * 
	 * 需要在web.xml 中配置过滤器 配置后才能出发put和delete  还有一点要用tomcat7运行
	 * tomcat8 会报JSPs only permit GET POST or HEAD 这个问题，但是控制台会正常打印
	 * 或者在要跳转的页面 添加isErrorPage="true" 能解决问题
	 * <filter>
	  	<filter-name>HiddenHttpMethodFilter</filter-name>
	  	<filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	  </filter>
	  <filter-mapping>
	  	<filter-name>HiddenHttpMethodFilter</filter-name>
	  	<url-pattern>/*</url-pattern>
	  </filter-mapping>
 
	 */
	@RequestMapping(value="testRequest",method=RequestMethod.GET)
	public String testGet(){
		
		System.out.println("get请求触发");
		return "success";
	}
	
	@RequestMapping(value="testRequest",method=RequestMethod.POST)
	public String testPost(){
		System.out.println("post请求触发");
		return "success";
	}
	@RequestMapping(value="testRequest",method=RequestMethod.PUT)
	public String testPut(){
		System.out.println("Put请求触发");
		return "success";
	}
	@RequestMapping(value="testRequest",method=RequestMethod.DELETE)
	public String testDelete(){
		System.out.println("Delete请求触发");
		return "success";
	}
}
