package com.oguzhant.issuemanagement.service;

import com.oguzhant.issuemanagement.entity.Issue;
import com.oguzhant.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);
    User getById(Long id);
    User getByUserName(String username);
    Page<User> getAllPageable(Pageable pageable);
    Boolean delete(User user);
}
