package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {

}
