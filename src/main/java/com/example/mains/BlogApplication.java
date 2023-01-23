package com.example.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Repository.BlogRepository;


@SpringBootApplication
public class BlogApplication implements CommandLineRunner {
	
	public  static void main(String[] args)
	{
	SpringApplication.run(BlogApplication.class,args);
	}
	
@SuppressWarnings("unused")
private BlogRepository blogRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		
	}
}
