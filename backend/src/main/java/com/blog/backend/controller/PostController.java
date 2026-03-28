package com.blog.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.blog.backend.entity.Post;
import com.blog.backend.Service.PostService;

@RestController
@RequestMapping("/posts")
@CrossOrigin
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> getAllPosts() {
        return service.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id) {
        return service.getPost(id);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.createPost(post);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        service.deletePost(id);
        return "Post deleted successfully";
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
        return service.updatePost(id, updatedPost);
    }
}
