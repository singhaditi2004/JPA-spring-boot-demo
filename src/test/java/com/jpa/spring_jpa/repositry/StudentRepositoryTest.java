package com.jpa.spring_jpa.repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.spring_jpa.entity.Student;

@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository sturepo;

	@Test
	public void saveStudent() {
		Student stud = Student.builder().emailId("Shalu@gmail.com").sFName("Shalu").sLName("Sharma").build();
		sturepo.save(stud);

	}

	@Test
	public void printAllStudent() {
		List<Student> stuList = sturepo.findAll();
		System.out.println("List = " + stuList.toString());
	}
}
