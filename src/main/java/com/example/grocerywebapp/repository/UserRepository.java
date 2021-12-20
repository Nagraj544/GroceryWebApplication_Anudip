package com.example.grocerywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocerywebapp.entity.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer>{

}
