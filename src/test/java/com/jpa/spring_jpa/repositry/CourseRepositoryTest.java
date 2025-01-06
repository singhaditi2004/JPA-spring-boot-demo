package com.jpa.spring_jpa.repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.jpa.spring_jpa.entity.Course;
import com.jpa.spring_jpa.entity.CourseMaterial;
import com.jpa.spring_jpa.entity.Teacher;


@SpringBootTest
class CourseRepositoryTest {

	@Autowired
	private CourseRepository crepo;

	@Test
	public void printCourses() {
		List<Course> courses = crepo.findAll();
		System.out.println("courses= " + " " + courses);
	}

	@Test
	public void saveCourseWithTeacher() {
		Teacher teach = Teacher.builder().firstName("Ashi").lastName("Tiwari").build();
		// CourseMaterial cm = CourseMaterial.builder().build();

		Course cr = Course.builder().title("Algo").credit(10).teacher(teach).build();

		crepo.save(cr);

	}

	@Test
	public void findAllPagination() {
		Pageable firstPageableWithThreeRec = PageRequest.of(0, 3);
		Pageable secondPageWithTwoRecords = PageRequest.of(1, 2);
		List<Course> courses = crepo.findAll(firstPageableWithThreeRec).getContent();
		System.out.println("courses = " + courses);
	}

	@Test
	public void findAllBySorting() {
		Pageable sortByTitle = PageRequest.of(0, 2, org.springframework.data.domain.Sort.by("title"));
		List<Course> courses = crepo.findAll(sortByTitle).getContent();
		System.out.println("sorted" + courses);
	}

	@Test
	public void printfindByTitleContaingCourses() {
		Pageable firstPageTenRecords = PageRequest.of(0, 10);

		List<Course> courses = crepo.findByTitleContaining("D", firstPageTenRecords);
	    System.out.println(courses);

	}
}
