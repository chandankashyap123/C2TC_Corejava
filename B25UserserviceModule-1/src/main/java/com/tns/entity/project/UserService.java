package com.tns.entity.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.entity.project.User;
import com.tns.entity.project.UserRepository;
@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll() 
	{
		
		return repo.findAll();
	}

	public User get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}