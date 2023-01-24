package com.example.thebegin.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfigration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){

        return args -> {

           Student joud = new Student(
                   5L,
                    "Joud",
                    "joudnassar.19.9@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 19)

            );
            Student grace = new Student(
                            "Gracee",
                            "graceabousaadee@gmail.com",
                            LocalDate.of(1997, Month.MARCH, 29)

                    );

            studentRepository.saveAll(
                    List.of(joud,grace)
            );
            studentRepository.saveAll(
                    List.of(joud,grace)
            );



        };




    }







}
