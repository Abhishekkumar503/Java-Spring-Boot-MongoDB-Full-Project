package com.abis.project.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.abis.project.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class SearchRepositoryImplementation implements SearchRepository{

	@Autowired
	MongoClient client1;
	
	@Autowired
	MongoConverter converter;
	
	@Override
	public List<Post> findByText(String text) {
		// TODO Auto-generated method stub
		final List<Post> list = new ArrayList<Post>();
	
		MongoDatabase database = client1.getDatabase("MongoDb");
		MongoCollection<Document> collection = database.getCollection("Mongo Collection");

		AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", 
		    new Document("text", 
		    new Document("query", text)
		                .append("path", Arrays.asList("tech", "profile", "desc")))), 
		    new Document("$sort", 
		    new Document("exp", -1L)), 
		    new Document("$limit", 5L)));
		
		
		result.forEach(doc -> list.add(converter.read(Post.class, doc)));
		return list;
	}

}