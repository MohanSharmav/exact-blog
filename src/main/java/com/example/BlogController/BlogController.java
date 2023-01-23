package com.example.BlogController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogService.BlogServices;

@RestController
public class BlogController {
	
private BlogServices blogerService;

	public BlogController(BlogServices blogerService) {
		super();
	this.blogerService=blogerService;	
	
	}
	
	@RequestMapping("/")
	public String hi()
	{
		return "blogs";
	}
	
	
	@RequestMapping("/blogs")
	
public String listBlogsAll(Model model)
	{
		model.addAttribute("blogs",blogerService.getAllBlogs());
		
		return "blogs";	
	}
	
	
}
