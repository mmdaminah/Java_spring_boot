package com.example.dependencyinjectionspring;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@AllArgsConstructor
//@Setter
@Component
public class AdminDbServiceImp implements AdminService{
    private AdminDao adminDao;
    private AdminMapper adminMapper;
    @Autowired
    public AdminDbServiceImp(@Qualifier("adminJdbcDao") AdminDao adminDao, AdminMapper adminMapper) {
        this.adminDao = adminDao;
        this.adminMapper = adminMapper;
    }

    @Override
    public void findAdmin() {
        System.out.printf("this is class: %s%n", this.getClass().getName());
        System.out.printf("this is adminDao:  %s%n", this.adminDao.getClass().getName());
        System.out.printf("this is adminMapper: %s%n", this.adminMapper.getClass().getName());
    }
}
