package com.balikesoft.secureRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.balikesoft.secureRestApi.domain.RandomCity;
import com.balikesoft.secureRestApi.domain.User;
import com.balikesoft.secureRestApi.service.GenericService;



/**
	 * Created by nydiarra on 06/05/17.
	 */
	@RestController
	@RequestMapping("/springjwt")
	public class ResourceController {
	    @Autowired
	    private GenericService userService;

	    @RequestMapping(value ="/cities")
	    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	    public List<RandomCity> getUser(){
	        return userService.findAllRandomCities();
	    }

	    @RequestMapping(value ="/users", method = RequestMethod.GET)
	    @PreAuthorize("hasAuthority('ADMIN_USER')")
	    public List<User> getUsers(){
	        return userService.findAllUsers();
	    }
	}



