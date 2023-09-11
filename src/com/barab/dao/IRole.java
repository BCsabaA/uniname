package com.barab.dao;

import java.util.List;

import com.barab.model.Role;

public interface IRole {

	public List<Role> getAll();
	public Role getById(Long id);
	
}
