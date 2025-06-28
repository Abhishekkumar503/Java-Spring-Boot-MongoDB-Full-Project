package com.abis.project.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.abis.project.model.Post;


public interface SearchRepository {
	
	List<Post> findByText(String text);

}
