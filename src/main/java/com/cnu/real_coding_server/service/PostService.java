package com.cnu.real_coding_server.service;

import com.cnu.real_coding_server.entity.Post;
<<<<<<< HEAD
import com.cnu.real_coding_server.entity.Project;
import com.cnu.real_coding_server.model.request.PostRequest;
import com.cnu.real_coding_server.model.request.ProjectRequest;
import com.cnu.real_coding_server.repository.PostRepository;
import com.cnu.real_coding_server.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
=======
import com.cnu.real_coding_server.model.request.PostRequest;
import com.cnu.real_coding_server.repository.PostRepository;
import lombok.RequiredArgsConstructor;
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
@RequiredArgsConstructor
=======
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
@Service
@RequiredArgsConstructor
public class PostService {
<<<<<<< HEAD
    private final PostRepository postRepository; // 생성되는 postRepository 를 가지고 있을 것
=======

    private final PostRepository postRepository;
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4

    public Post createPost(PostRequest postRequest) {
        return postRepository.save(postRequest.toEntity());
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPost(Integer postId) {
        return postRepository.findById(postId);
    }

<<<<<<< HEAD
    /* 수정할 게시글의 ID를 넘겨줘야 할 필요가 있다.
     * postId의 post를 postRequest로 변경할 것임 */
=======
>>>>>>> 4ff27d07932a02d41a1675328b390217c8441fd4
    public Optional<Post> updatePost(Integer postId, PostRequest postRequest) {
        return postRepository.findById(postId)
                .map(post -> {
                    post.setTitle(postRequest.getTitle());
                    post.setContents(postRequest.getContents());
                    post.setTag(postRequest.getTag());
                    return postRepository.save(post);
                });
    }

    public void deletePost(Integer postId) {
        postRepository.findById(postId)
                .ifPresent(postRepository::delete);
    }
}
