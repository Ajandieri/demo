package com.example.demo.student;

import java.util.List;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository) {
        return args -> {

            Student mariam = new Student("Mariam", "mariam@gmail.com", LocalDate.of(2000, 1, 5), 21);
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2002, 4, 11), 19);
            Student john = new Student("John", "john@gmail.com", LocalDate.of(1985, 12, 18), 40);

            repository.saveAll( List.of(mariam, alex, john));
        };
    }

}
