package com.example.demo.serviceImpl;

import com.example.demo.controller.DataJpa;
import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private DataJpa dataJpa;
    @Override
    public Admin findById(String id) {
        return (Admin) dataJpa.findById(id).get();
    }

    @Override
    public List<Admin> findAll() {
        return (List<Admin>) dataJpa.findAll();
    }

    @Override
    public Admin save(Admin admin) {
        return (Admin) dataJpa.save(admin);
    }

    @Override
    public void delete(String id) {
        dataJpa.deleteById(id);
    }

    @Override
    public Page<Admin> findAll(Pageable pageable) {
        return dataJpa.findAll(pageable);
    }
}
