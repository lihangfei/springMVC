package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class methodTest {

	/*
	 * ͬ������ ��������
	 * get �� post �����
	 * put��delete û���
	 * 
	 * ��Ҫ��web.xml �����ù����� ���ú���ܳ���put��delete  ����һ��Ҫ��tomcat7����
	 * tomcat8 �ᱨJSPs only permit GET POST or HEAD ������⣬���ǿ���̨��������ӡ
	 * ������Ҫ��ת��ҳ�� ���isErrorPage="true" �ܽ������
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
		
		System.out.println("get���󴥷�");
		return "success";
	}
	
	@RequestMapping(value="testRequest",method=RequestMethod.POST)
	public String testPost(){
		System.out.println("post���󴥷�");
		return "success";
	}
	@RequestMapping(value="testRequest",method=RequestMethod.PUT)
	public String testPut(){
		System.out.println("Put���󴥷�");
		return "success";
	}
	@RequestMapping(value="testRequest",method=RequestMethod.DELETE)
	public String testDelete(){
		System.out.println("Delete���󴥷�");
		return "success";
	}
}
