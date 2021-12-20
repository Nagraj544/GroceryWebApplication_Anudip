package com.example.grocerywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocerywebapp.entity.CheckoutData;

public interface CheckRepository extends JpaRepository<CheckoutData, Integer> {

}
