package com.abis.project.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abis.project.model.Post;

public interface PostRepo extends MongoRepository<Post, String>{


}
