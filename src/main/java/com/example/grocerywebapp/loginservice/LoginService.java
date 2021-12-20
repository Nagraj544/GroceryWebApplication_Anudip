package com.example.grocerywebapp.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocerywebapp.logindomain.Login;
import com.example.grocerywebapp.loginrepository.LoginRepository;

@Service
public class LoginService {
@Autowired
private LoginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
   return user;
  }
 
}
