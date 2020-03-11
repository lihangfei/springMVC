package pccc.li.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class paramTest {

	/*
	 * jsp���ݵ�ֵ��key��Controller���ܵ�key��Ӧ�Ͼ���ֱ�ӽ���
	 */
	/*@RequestMapping("paramTest")
	public String test(String name,Integer age){
		
		System.out.println("name="+name+","+"age="+age);
		return "param";
	}*/
	
	/*
	 * ������key ��Ҫ���в����� �罫name �󶨵�username��
	 */
	@RequestMapping("paramTest")
	public String test(@RequestParam(value="name") String username,Integer age){
		
		System.out.println("name="+username+","+"age="+age);
		return "param";
	}
	
	/*@RequestParam 
	 * value ��Ӧkeyֵ��
	 * required ������ �ò����ǲ��Ǳ�Ҫ�� true����Ҫ�������ᱨ��      false�ɴ��ɲ���
	 * defaultValue Ĭ��ֵ������ò���û��ֵ������Ĭ�ϸ�ֵ  ��requiredλfalse��дʱ��Ч
	 * CookieValue ��ȡ@Cookie��Ϣ
	 */
	
	//jsp ҳ��û�д�name��ֵ����������Ĭ�ϸ���
	@RequestMapping("testRequired")
	public String testRequired(@RequestParam(value="name",required=false ,defaultValue = "������") String username,Integer age){
		
		System.out.println("name="+username+","+"age="+age);
		return "param";
	}
	
	@RequestMapping("testRequireda")
	public String testCookie(@CookieValue(value="JSESSIONID")String sessionId){
		
		System.out.println("sessionId="+sessionId);
		return "param";
	}
	/*
	 * ����ͨ�� HttpServletRequest �����ȡ���ݹ����Ĳ���
	 * springMVC��Handler�������Խ���ServeletAPI�еĶ���
	 * 1,HttpServletRequest
	 * 2,HttpServletResponce
	 * 3,HttpSession
	 * 4,InputStream ��
	 * 5,OutStream д
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
