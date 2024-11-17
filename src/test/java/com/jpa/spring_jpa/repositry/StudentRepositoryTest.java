package com.jpa.spring_jpa.repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.spring_jpa.entity.Guardian;
import com.jpa.spring_jpa.entity.Student;

@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository sturepo;

	@Test
	public void saveStudent() {
		Student stud = Student.builder().emailId("asd@gmail.com").firstName("Shalu").lastName("Sharma").build();
		sturepo.save(stud);

	}

	@Test
	public void saveStudentWithGuardian() {
		Guardian gd = Guardian.builder().gName("Advika ke papa").gEmail("awa@gmail.com").gMob("7654345566").build();
		Student student = Student.builder().firstName("Advikaa").lastName("Sen")
				.emailId("adaaawaaaaaaaaaaaaaaaaaaavaassia@gmail.com").grd(gd).build();

		sturepo.save(student);
	}

	@Test
	public void printAllStudent() {
		List<Student> stuList = sturepo.findAll();
		System.out.println("List = " + stuList.toString());
	}

	@Test
	public void printStudentByFirstName(String fName) {
		List<Student> stude = sturepo.findByFirstName("Advikaa");

		System.out.println("st" + " " + stude);
	}

	@Test
	public void printStudentByFirstNameContaining() {
		List<Student> stude = sturepo.findByFirstNameContaining("Ad");

		System.out.println("st" + " " + stude);
	}

	@Test
	public void printStudentByLastName() {
		List<Student> stude = sturepo.findByLastName("Sharma");

		System.out.println("st" + " " + stude);
	}

	@Test
	public void printGetStudentByEmailAddress() {
		Student st = sturepo.getStudentByEmailAddress("a@gmail.com");
		System.out.println("sttt" + "" + st);

	}
	
	@Test
	public void updateStudentNameByEmailIdTest() {
		sturepo.updateStudentNameByEmailId("Aditi", "asd@gmail.com");
		
	}
}
