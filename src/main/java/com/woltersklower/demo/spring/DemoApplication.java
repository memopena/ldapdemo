package com.woltersklower.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.woltersklower.demo")
@EnableJpaRepositories("com.woltersklower.demo")
@EntityScan("com.woltersklower.demo.web.model")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class[] { DemoApplication.class, DemoSecurityConfig.class, DemoWebMvcConfiguration.class }, args);
    }

}
