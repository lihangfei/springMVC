package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AntController {

	/*
	 * springMVC ֧��Ant��ʽ������·��
	 * ��Ant����3��ƥ���
	 * *�������ַ�
	 * ?:����һ���ֶ�
	 * **��������Ŀ¼
	 */
	
	//��ʾ�ĺ��� ��ǰ����������ַ�
	//������������  http://localhost:8080/SpringMVC/adc/testAnt"
	//adc ���Ի��������ַ�
	@RequestMapping(value="/*/testAnt")
	public String testAnt(){
		
		return "success";
	}
	/*
	 * ���൱��ռλ��
	 * ��ʾ������antMM����antJJ����antss����
	 * ������������  http://localhost:8080/SpringMVC/antss/testAnt"
	 */
	
	@RequestMapping(value="/ant?/testAnt")
	public String testAnt1(){
		
		return "success";
	}
	/*
	 * ** ��ʾ�༶Ŀ¼
	 * ������������  http://localhost:8080/SpringMVC/a/d/c/testAnt"
	 */
	@RequestMapping(value="/**/testAnt")
	public String testAnt2(){
		
		return "success";
	}
	
}
