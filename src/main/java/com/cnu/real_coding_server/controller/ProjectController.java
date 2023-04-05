package com.cnu.real_coding_server.controller;

import com.cnu.real_coding_server.entity.Project;
import com.cnu.real_coding_server.model.request.ProjectRequest;
import com.cnu.real_coding_server.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects") // resources are always in plural.
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;
    
    // Projects management
    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody ProjectRequest projectRequest) {
        // projectRequest body required
        return ResponseEntity.ok(projectService.createProject(projectRequest));
    }
}
