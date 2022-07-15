package com.example.sql_jpa;

import com.example.sql_jpa.entity.Student;
import com.example.sql_jpa.repository.CoinRepository;
import com.example.sql_jpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student("Maria",
                    "Jones",
                    "maria.jones@pavel.edu",
                    21
            );
            Student johnny = new Student("Johnny",
                    "Jameson",
                    "jameson.ruless@pavel.ru",
                    45
            );

            studentRepository.save(maria);
            studentRepository.save(johnny);
        };
    }
}
