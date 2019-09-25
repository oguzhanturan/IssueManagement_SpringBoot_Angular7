package com.oguzhant.issuemanagement.repository;

import com.oguzhant.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {

}
