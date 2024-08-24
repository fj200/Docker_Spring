package com.Blogging.BloggingAPI.service;

import com.Blogging.BloggingAPI.model.Post;
import com.Blogging.BloggingAPI.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostRepository postRepository;

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPostById(String postId) {
        return postRepository.findById(postId).get();
    }

    @Override
    public Post deletePost(String postId) {
        Post post = postRepository.findById(postId).get();
        postRepository.deleteById(postId);
        return post;
    }

    @Override
    public List<Post> getPostsByCategory(String category) {
        return postRepository.findByCategory(category);
    }
}
