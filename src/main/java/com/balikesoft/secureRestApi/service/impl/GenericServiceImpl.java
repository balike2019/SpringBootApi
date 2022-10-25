package com.balikesoft.secureRestApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balikesoft.secureRestApi.domain.RandomCity;
import com.balikesoft.secureRestApi.domain.User;
import com.balikesoft.secureRestApi.repository.RandomCityRepository;
import com.balikesoft.secureRestApi.repository.UserRepository;
import com.balikesoft.secureRestApi.service.GenericService;

import java.util.List;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
