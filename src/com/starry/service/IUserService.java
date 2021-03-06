package com.starry.service;

import java.util.List;

import com.starry.entity.User;
import com.starry.entity.UserRegister;

public interface IUserService {
	public abstract List<User> selectAll();

	public abstract int deleteById(int id);

	public abstract int register(User user);
}
