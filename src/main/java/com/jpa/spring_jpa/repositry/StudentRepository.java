package com.jpa.spring_jpa.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpa.spring_jpa.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
