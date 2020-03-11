package pccc.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ModleAndView {
	/*
	 * ModelAndView
	 * 模型添加
	 * 视图设置
	 * 返回对象
	 */
	@RequestMapping("testModelAndView")
	public ModelAndView test(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","root");//往request作用域中赋值
		mv.setViewName("success");//设置视图名称 实现跳转
		return mv;
	}
	
	
	
	@RequestMapping("testModelAndViewWithMap")
	public String test(Map<String, Object> map){
	
		map.put("userName","admin");
		return "success";
	}
	
	
	
	
	
	
}
