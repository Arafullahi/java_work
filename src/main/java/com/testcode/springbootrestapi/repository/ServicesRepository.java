package com.testcode.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcode.springbootrestapi.model.Services;

public interface ServicesRepository extends JpaRepository<Services, Long> {

}
