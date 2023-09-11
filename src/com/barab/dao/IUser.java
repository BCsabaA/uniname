package com.barab.dao;

import java.util.List;

import com.barab.model.Role;
import com.barab.model.User;

public interface IUser {
	
	public List<User> getAll();
	public Role getById(Long id);

}
