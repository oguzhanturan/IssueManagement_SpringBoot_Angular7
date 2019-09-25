package com.oguzhant.issuemanagement.service;

import com.oguzhant.issuemanagement.dto.IssueDto;
import com.oguzhant.issuemanagement.entity.Issue;
import com.oguzhant.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);


}
