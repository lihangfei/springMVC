package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ModleAndView {
	/*
	 * ModelAndView
	 * ģ�����
	 * ��ͼ����
	 * ���ض���
	 */
	@RequestMapping("testModelAndView")
	public ModelAndView test(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","root");//��request�������и�ֵ
		mv.setViewName("success");//������ͼ���� ʵ����ת
		return mv;
	}
	
	
	
	@RequestMapping("testModelAndViewWithMap")
	public String test(Map<String, Object> map){
	
		map.put("userName","admin");
		return "success";
	}
	
	
	
	
	
	
}
