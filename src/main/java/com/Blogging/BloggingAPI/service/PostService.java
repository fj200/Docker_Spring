package com.Blogging.BloggingAPI.service;

import com.Blogging.BloggingAPI.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post createPost(Post post);
    Post getPostById(String postId);
    Post deletePost(String postId);
    List<Post> getPostsByCategory(String category);
}
