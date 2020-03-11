package pccc.li.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class paramTest {

	/*
	 * jsp传递的值得key和Controller接受的key对应上就能直接接受
	 */
	/*@RequestMapping("paramTest")
	public String test(String name,Integer age){
		
		System.out.println("name="+name+","+"age="+age);
		return "param";
	}*/
	
	/*
	 * 如果想改key 需要进行参数绑定 如将name 绑定到username上
	 */
	@RequestMapping("paramTest")
	public String test(@RequestParam(value="name") String username,Integer age){
		
		System.out.println("name="+username+","+"age="+age);
		return "param";
	}
	
	/*@RequestParam 
	 * value 对应key值绑定
	 * required 传参是 该参数是不是必要的 true必须要传不传会报错      false可传可不传
	 * defaultValue 默认值，如果该参数没有值，可以默认赋值  当required位false或不写时有效
	 * CookieValue 获取@Cookie信息
	 */
	
	//jsp 页面没有传name的值，但是这里默认给了
	@RequestMapping("testRequired")
	public String testRequired(@RequestParam(value="name",required=false ,defaultValue = "兰陵王") String username,Integer age){
		
		System.out.println("name="+username+","+"age="+age);
		return "param";
	}
	
	@RequestMapping("testRequireda")
	public String testCookie(@CookieValue(value="JSESSIONID")String sessionId){
		
		System.out.println("sessionId="+sessionId);
		return "param";
	}
	/*
	 * 可以通过 HttpServletRequest 对象获取传递过来的参数
	 * springMVC的Handler方法可以接受ServeletAPI中的对象
	 * 1,HttpServletRequest
	 * 2,HttpServletResponce
	 * 3,HttpSession
	 * 4,InputStream 读
	 * 5,OutStream 写
	 * 6,Locale 
	 * 7,Reader
	 * 8,Writer
	 */
	@RequestMapping("testRequireds")
	public String testCookie(HttpServletRequest request ){
		String userName = request.getParameter("name");
		System.out.println("name="+userName);
		return "param";
	}
	
	
	
	
}
