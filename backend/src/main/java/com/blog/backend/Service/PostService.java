package com.blog.backend.Service;

import com.blog.backend.entity.Post;
import java.util.List;

public interface PostService {

    // 📄 Get all posts
    List<Post> getAllPosts();

    // 🔍 Get post by ID
    Post getPost(Long id);

    // ➕ Create post
    Post createPost(Post post);

    // ❌ Delete post
    void deletePost(Long id);

    // ✏️ Update post
    Post updatePost(Long id, Post updatedPost);
}