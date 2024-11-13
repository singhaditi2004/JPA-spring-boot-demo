package com.jpa.spring_jpa.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.jpa.spring_jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String firstName);

	public List<Student> findByFirstNameContaining(String name);
	
	public List<Student> findByLastName(String lastName);
	
	@Query("select s from Student s where s.emailId=?1")
	Student getStudentByEmailAddress(String emailId);
	
}
