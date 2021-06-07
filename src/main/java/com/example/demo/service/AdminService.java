package com.example.demo.service;

import com.example.demo.entity.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {
    Admin findById(String id);
    List<Admin> findAll();
    Admin save(Admin admin);
    void delete(String id);
    Page<Admin> findAll(Pageable pageable);
}
