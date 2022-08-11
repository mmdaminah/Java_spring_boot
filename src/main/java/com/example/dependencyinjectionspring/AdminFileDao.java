package com.example.dependencyinjectionspring;

import org.springframework.stereotype.Component;

@Component(value = "adminFileDao")
public class AdminFileDao implements AdminDao{
}
