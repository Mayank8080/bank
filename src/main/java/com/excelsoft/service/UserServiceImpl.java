package com.excelsoft.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.excelsoft.dao.UserDao;
import com.excelsoft.enties.Customer;
import com.excelsoft.enties.User;
import com.excelsoft.exceptions.RecordNotFoundException;

public class UserServiceImpl implements UserService{
@Autowired 
private UserDao userdao;
	@Override
	@Transactional
	public User registerNewUserService(User user) {
		 {
			user=userdao.registerNewUser(user);
			return user;
		}
		
	}

	@Override
	@Transactional
	public User searchByUserNameService(String userName) {
		User user=userdao.searchByUserName(userName);
		if(user==null) {
			String msg="user  "+userName+" not found";
			throw new RecordNotFoundException(msg);
		}
		return user;
	}
	
}
