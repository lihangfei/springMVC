package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {

	/*
	 * @requestMapping ��4������
	 * value ���÷�����
	 * 
	 * method ��������ʽ get��  post��  put��  deleteɾ
	 * 
	 * params ���ò��� 
	 * 
	 * headers ����ͷ �õ��ıȽ���
	 * 
	 * ��Щ�����൱�ڸ��������Լ��������
	 */
	//��ʾ ������ΪtestRequestMapController  ����ʽΪ GET  һ��Ҫ�в���userName�ֶη�����ʲ�ͬ��
	//������������  http://localhost:8080/SpringMVC/testRequestMapController?userName="�����"
	@RequestMapping(value="testRequestMapController",method=RequestMethod.GET,params={"userName","!age"})
	public String test(){
		
		return "success";
	}
	//�����ʾ���������治����age�ֶ�
	@RequestMapping(value="testRequestMapController",params={"userName","!age"})
	public String test1(){
		
		return "success";
	}
	//�����ʾ �����б�����userName�ֶ� ͬʱage�������12
	@RequestMapping(value="testRequestMapController",params={"userName","age=12"})
	public String test2(){
		
		return "success";
	}
	
	//�����ʾ �����б�����userName�ֶ� ͬʱage���벻����12
	@RequestMapping(value="testRequestMapController",params={"userName","age!=12"})
	public String test3(){
		
		return "success";
	}
}
