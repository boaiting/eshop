package com.boaiting.eshop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.boaiting.eshop.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
