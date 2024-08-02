package com.zomatoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zomatoapp.ZomatodemoSandeepHotelApplication;
import com.zomatoapp.model.Menu;
import com.zomatoapp.service.ServiceI;

@RestController
public class Homecontroller {
	@Autowired
	ServiceI si;
	
	
	
	@GetMapping("/getdata")
	public Iterable<Menu> getdata()
	{
      Iterable<Menu>itr=si.showdata();
      
      return itr;
      
	 }
	
	
	
	
	
	
	
}