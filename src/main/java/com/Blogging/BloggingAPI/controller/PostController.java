package com.Blogging.BloggingAPI.controller;

import com.Blogging.BloggingAPI.model.Post;
import com.Blogging.BloggingAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable String postId){
        return postService.getPostById(postId);
    }

    @DeleteMapping("/{postId}")
    public Post delelePost(@PathVariable String postId){
        return postService.deletePost(postId);
    }

    @GetMapping("/post")
    public List<Post> getPostByCategory(@RequestParam String category){
        return postService.getPostsByCategory(category);
    }

}
