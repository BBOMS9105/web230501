package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

//import jakarta.validation.Valid;

@Controller
public class MyController {

	@RequestMapping("/insertForm")
	public String insert1() {
		
		return "createPage";
	}
	
	
	@RequestMapping("/create")
	public String insert2(
			@ModelAttribute("dto")
			@Valid
			ContentDto contentDto,
			BindingResult result
			) {
			
			String page = "createDonePage";
			System.out.println(contentDto);
		
			
			if(result.hasErrors()) {
				if (result.getFieldError("writer") != null ) {
				String err1 = result.getFieldError("writer").getDefaultMessage();
				System.out.println("err1 : " + err1);
				}
				
				if (result.getFieldError("content") != null ) {
				String err2 = result.getFieldError("content").getDefaultMessage();
				System.out.println("err2 : " + err2);
				}
				
				page = "createPage";
			}
			
			return page;
			
			}
}
