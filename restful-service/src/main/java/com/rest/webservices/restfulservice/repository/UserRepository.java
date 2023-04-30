package com.rest.webservices.restfulservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.webservices.restfulservice.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
