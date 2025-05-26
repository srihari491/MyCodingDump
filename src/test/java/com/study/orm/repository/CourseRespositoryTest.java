package com.study.orm.repository;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.orm.entity.Course;

@SpringBootTest
class CourseRespositoryTest {
	@Autowired
	CourseRespository courseRepo;
	@Test
	void test() {
		Course course = Course.builder()
				.courseId(1L)
				.courseName("DSA")
				.build();
		courseRepo.save(course);
	}

}
