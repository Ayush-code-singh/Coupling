package com.example.componentScanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Here we are using annotation to scan the packages instead of using XML configuration.

@Configuration
@ComponentScan(basePackages = "com.example.componentScanAnnotation")
public class AppConfig {

}
