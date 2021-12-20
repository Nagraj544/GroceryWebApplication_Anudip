package com.example.grocerywebapp.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocerywebapp.logindomain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
