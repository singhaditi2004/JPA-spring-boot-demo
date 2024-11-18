package com.jpa.spring_jpa.repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.spring_jpa.entity.Course;
import com.jpa.spring_jpa.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {
	@Autowired
	private CourseMaterialRepository cmrepo;

	@Test
	public void saveCourseMaterial() {
		Course c = Course.builder().credit(10).title("Java course").build();
		CourseMaterial cm = CourseMaterial.builder().url("url").course(c).build();

		cmrepo.save(cm);

	}
@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courses = cmrepo.findAll();
		System.out.println("cm"+" "+courses);

	}

}
