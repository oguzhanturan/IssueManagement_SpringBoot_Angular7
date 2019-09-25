package com.oguzhant.issuemanagement.repository;

import com.oguzhant.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *List<Project> getAllByProjectCode(String projectCode);
 List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);
 List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode,String name);
 **/
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);
}