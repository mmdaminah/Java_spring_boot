package com.example.dependencyinjectionspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyinjectionspringApplication {

  public static void main(String[] args) {
//    SpringApplication.run(DependencyinjectionspringApplication.class, args);

//    var context = new ClassPathXmlApplicationContext("beans.xml");

    var context = new AnnotationConfigApplicationContext(DependencyConfiguration.class);

    AdminService adminService = context.getBean("adminFileService",AdminService.class);

    adminService.findAdmin();
  }
}
