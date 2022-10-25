package com.balikesoft.secureRestApi.service;

import java.util.List;

import com.balikesoft.secureRestApi.domain.RandomCity;
import com.balikesoft.secureRestApi.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
