package com.example.universitydb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.universitydb.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentCode(String studentCode);
    List<Student> findByFullNameContainingIgnoreCase(String text);
    List<Student> findAllByOrderByFullNameAsc();
    boolean existsByEmail(String email);
    long countByEmailEndingWith(String domain);
}