package com.in28minutes.springBoot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springBoot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Insert courses
        repository.save(new Course(1L, "AWS", "John"));
        repository.save(new Course(2L, "Azure", "Jane"));
        repository.save(new Course(3L, "GCP", "Doe"));
        
        // Delete a course
        repository.deleteById(1L);

        // Find courses by ID
        System.out.println(repository.findById(2L).orElse(null));
        System.out.println(repository.findById(3L).orElse(null));
        
        // Find all courses
        System.out.println(repository.findAll());
        
        // Count courses
        System.out.println(repository.count());
        
        // Find courses by author
        System.out.println(repository.findByAuthor("Doe"));
    }
}
