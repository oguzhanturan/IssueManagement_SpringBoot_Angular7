package com.oguzhant.issuemanagement.repository;

import com.oguzhant.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {

}
