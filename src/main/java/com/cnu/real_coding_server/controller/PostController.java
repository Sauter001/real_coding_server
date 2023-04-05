package com.cnu.real_coding_server.controller;

import com.cnu.real_coding_server.entity.Post;
<<<<<<< HEAD
import com.cnu.real_coding_server.entity.Project;
import com.cnu.real_coding_server.model.request.PostRequest;
import com.cnu.real_coding_server.model.request.ProjectRequest;
import com.cnu.real_coding_server.service.PostService;
import com.cnu.real_coding_server.service.ProjectService;
=======
import com.cnu.real_coding_server.model.request.PostRequest;
import com.cnu.real_coding_server.service.PostService;
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping("/posts") // resources are always in plural.
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostRequest postRequest /* request body required */) {
        // postRequest body required
=======
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostRequest postRequest) {
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
        return ResponseEntity.ok(postService.createPost(postRequest));
    }

    @GetMapping
    public ResponseEntity<List<Post>> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPost(@PathVariable("postId") Integer postId) {
        return ResponseEntity.ok(postService.getPost(postId).orElse(null));
    }

    @PutMapping("/{postId}")
<<<<<<< HEAD
    public ResponseEntity<Post> updatePost(@PathVariable("postId") Integer postId,
=======
    public ResponseEntity<Post> updatePost(@PathVariable("postId")Integer postId,
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
                                           @RequestBody PostRequest postRequest) {
        return ResponseEntity.ok(postService.updatePost(postId, postRequest).orElse(null));
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePost(@PathVariable("postId") Integer postId) {
        postService.deletePost(postId);
<<<<<<< HEAD
        return ResponseEntity.noContent().build();
    }


=======

        return ResponseEntity.noContent().build();
    }
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
}
