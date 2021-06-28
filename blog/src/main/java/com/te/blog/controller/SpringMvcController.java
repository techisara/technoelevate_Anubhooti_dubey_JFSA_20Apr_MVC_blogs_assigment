package com.te.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcController {

	@RequestMapping(path = "/science", method = RequestMethod.GET)
	public ModelAndView getScience(ModelAndView modelAndView) {
		modelAndView.setViewName("science");
		return modelAndView;
		//blog/src/main/webapp/WEB-INF/views/science.jsp
	}
	
	@GetMapping("/movie")
	public String getMovie(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("name");
		map.addAttribute("name", name);
		return "movie";
	}

}