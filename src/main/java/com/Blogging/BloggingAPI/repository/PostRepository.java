package com.Blogging.BloggingAPI.repository;

import com.Blogging.BloggingAPI.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByCategory(String category);
}
