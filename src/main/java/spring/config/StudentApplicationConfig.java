package spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = {"controller"})
public class StudentApplicationConfig {

        public static void main(String[] args) {
//            System.out.println("Starting application");
//            SpringApplication.run(StudentApplicat
//            ionConfig.class, args);

            SpringApplication app = new SpringApplication(StudentApplicationConfig.class);
            app.setDefaultProperties(Collections.singletonMap("server.port", "10083"));
            app.run(args);
        }
}
