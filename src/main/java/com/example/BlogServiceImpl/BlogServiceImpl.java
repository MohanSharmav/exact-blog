package com.example.BlogServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BlogEntity.BlogPojo;
import com.example.BlogService.BlogServices;
import com.example.Repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogServices {

	@Autowired
	private BlogRepository blogrepository;
	
	
//	public BlogServiceImpl(BlogRepository blogrepository) {
//		super();
//		this.blogrepository = blogrepository;
//	}
//	
	@Override
	public List<BlogPojo> getAllBlogs()
	{
		System.out.print("⭐ ⭐ ⭐ ⭐ ");
		return blogrepository.findAll();
	}

	
	

}
