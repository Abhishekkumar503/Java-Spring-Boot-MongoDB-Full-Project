package com.abis.project.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abis.project.model.Post;
import com.abis.project.repo.PostRepo;
import com.abis.project.repo.SearchRepository;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.NotEmpty;

@RestController
public class PostController {
	
	@Autowired
	PostRepo repo;

	@Autowired
	SearchRepository sRepo;
	

	@RequestMapping(value = "/") 
	public void redirect(HttpServletResponse response) throws IOException
	{
		response.sendRedirect("/swagger-ui.html");
	}

	@GetMapping("/posts")
	public List<Post> getAllPost()
	{
		int i=1/0;
		return repo.findAll();
	}
	
	@NotEmpty
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text)
	{
		return sRepo.findByText(text);
	}
	
	@PostMapping("/post")
	public Post createPost(@RequestBody Post post) {
		return repo.save(post);
	}
	
	
}
