package com.example.dependencyinjectionspring;

import org.springframework.stereotype.Component;

@Component(value = "adminJdbcDao")
public class AdminJdbcDao implements AdminDao{
}
