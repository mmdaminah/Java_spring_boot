package com.example.dependencyinjectionspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyConfiguration {
//    @Bean
//    public AdminFileDao adminFileDao(){
//        return new AdminFileDao();
//    }
//    @Bean
//    public AdminJdbcDao adminJdbcDao(){
//        return new AdminJdbcDao();
//    }
//    @Bean
//    public AdminMapperImp adminMapper(){
//        return new AdminMapperImp();
//    }
//    @Bean
//    public AdminDbServiceImp adminDbService(){
//        return new AdminDbServiceImp(adminJdbcDao(),adminMapper());
//    }
}
