package com.abis.project.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.abis.project.model.Post;

@Component
public class SearchRepositoryImplementation implements SearchRepository{

	@Override
	public List<Post> findByText(String text) {
		// TODO Auto-generated method stub
		final List<Post> list = new ArrayList<Post>();
		System.out.println("IN findByText!");
		return list;
	}

}
