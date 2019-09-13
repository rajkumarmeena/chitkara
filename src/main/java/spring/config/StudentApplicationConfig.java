package spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = {"controller", "dao"})
public class StudentApplicationConfig {

        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(StudentApplicationConfig.class);
            app.setDefaultProperties(Collections.singletonMap("server.port", "10083"));
            app.run(args);
        }
}
