package com.Blogging.BloggingAPI;

import com.Blogging.BloggingAPI.model.Post;
import com.Blogging.BloggingAPI.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BloggingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggingApiApplication.class, args);
	}

    @Autowired
    private PostServiceImpl postServiceImpl;

    @Bean
    public CommandLineRunner run() {
        return args -> {
            // Create a new post
            Post post = new Post();
            post.setTitle("My First Post");
            post.setContent("This is the content of the first post.");
            post.setCategory("Technology");
            post.setTags(List.of("Spring", "MongoDB", "Docker"));

            // Save the post
            Post createdPost = postServiceImpl.createPost(post);
            System.out.println("Created Post: " + createdPost);

            // Retrieve the post by ID
            Post retrievedPost = postServiceImpl.getPostById(createdPost.getId());
            System.out.println("Retrieved Post: " + retrievedPost);

            // Get posts by category
            List<Post> techPosts = postServiceImpl.getPostsByCategory("Technology");
            System.out.println("Posts in Technology category: " + techPosts);

            // Delete the post
            Post deletedPost = postServiceImpl.deletePost(createdPost.getId());
            System.out.println("Deleted Post: " + deletedPost);
        };
    }
}
