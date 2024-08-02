package com.zomatoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatoapp.model.Menu;
import com.zomatoapp.repository.Menurepository;

@Service
public class Serviceimpl implements ServiceI {

	@Autowired
	Menurepository mi;

	@Override
	public Iterable<Menu> showdata() {
		// TODO Auto-generated method stub
		Iterable<Menu>itr=mi.findAll();
		return itr;
	}
	
	

}
