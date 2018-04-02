package com.lc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.base.mapper.UserMapper;
import com.lc.base.model.User;
import com.lc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

}
