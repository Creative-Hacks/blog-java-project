package com.blog.backend.Service.impl;

import com.blog.backend.entity.Post;
import com.blog.backend.repository.PostRepository;
import com.blog.backend.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repo;

    // 📄 Get all posts
    @Override
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    // 🔍 Get post by ID
    @Override
    public Post getPost(Long id) {
        return repo.findById(id).orElse(null);
    }

    // ➕ Create post
    @Override
    public Post createPost(Post post) {
        return repo.save(post);
    }

    // ❌ Delete post
    @Override
    public void deletePost(Long id) {
        repo.deleteById(id);
    }

    // ✏️ Update post
    @Override
    public Post updatePost(Long id, Post updatedPost) {
        Post existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setTitle(updatedPost.getTitle());
            existing.setContent(updatedPost.getContent());
            existing.setAuthor(updatedPost.getAuthor());
            return repo.save(existing);
        }

        return null;
    }
}