package com.example.grocerywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocerywebapp.entity.ContactData;

public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
