package com.example.demo;

import com.example.demo.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }
    @Test
    public void test1(){
        String url="select id,username,password from customer";
        List<Admin> adminList=jdbcTemplate.query(url, new RowMapper<Admin>() {
            @Override
            public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
                Admin admin=new Admin();
                admin.setId(resultSet.getString("id"));
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
                return admin;
            }
        });
        System.out.println("查询成功");
        for (Admin bean :
                adminList) {
            System.out.println("id"+bean.getId()+"username "+bean.getUsername()+"password"+bean.getPassword());
        }
    }

    //springboot data jpa 的使用练习
    @Test
    public void testJpa(){

    }

}
