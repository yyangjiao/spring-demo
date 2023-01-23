package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yang")
@Import({DataSourceConfig.class})
public class SpringConfig {

}
