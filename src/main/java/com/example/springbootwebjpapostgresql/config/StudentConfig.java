package com.example.springbootwebjpapostgresql.config;

import com.example.springbootwebjpapostgresql.model.Student;
import com.example.springbootwebjpapostgresql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "mariam",
                    "email@email",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@email",
                    LocalDate.of(1988, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );

        };
    }

    public StudentConfig() {

    }


}
