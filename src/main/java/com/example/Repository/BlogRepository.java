package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.BlogEntity.BlogPojo;
import com.example.BlogService.BlogServices;

@Repository
public interface BlogRepository extends JpaRepository<BlogPojo, String> {

	
//	public static final BlogRepository blogrepository = null;
//	
//	
//	BlogPojo b=new BlogPojo();
//	
//	
//	public default List<BlogPojo> getAllBlogs()
//	{
//		return ((JpaRepository<BlogPojo, String>) blogrepository).findAll();
//	}

	
	

}