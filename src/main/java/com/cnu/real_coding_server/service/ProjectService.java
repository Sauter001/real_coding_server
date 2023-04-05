package com.cnu.real_coding_server.service;

import com.cnu.real_coding_server.entity.Project;
import com.cnu.real_coding_server.model.request.ProjectRequest;
import com.cnu.real_coding_server.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProjectService {
    private final ProjectRepository projectRepository; // 생성되는 projectRepository 를 가지고 있을 것

    // Project 부분
    public Project createProject(ProjectRequest projectRequest) {
        return projectRepository.save(projectRequest.toEntity());
    }
}
