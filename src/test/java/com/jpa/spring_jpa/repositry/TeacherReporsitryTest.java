package com.jpa.spring_jpa.repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.spring_jpa.entity.Course;
import com.jpa.spring_jpa.entity.Teacher;

@SpringBootTest
class TeacherReporsitryTest {

	@Autowired
	private TeacherReporsitry teachRepo;

	@Test
	public void saveTeacher() {
		Course c1 = Course.builder().credit(6).title("Mongo DB").build();
		List<Course> list = new ArrayList<>();
		list.add(c1);
		Teacher teacher = Teacher.builder().firstName("Isha").lastName("Sati").courses(list).build();
		teachRepo.save(teacher);
	}

}
