package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/*
	 * RequestMapping ӳ�䷽����  ��jspҳ����÷����� ���ɵ���Controllerҳ��ķ���
	 * RequestMapping ���Է��������� Ҳ���Է��ڷ���������
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
