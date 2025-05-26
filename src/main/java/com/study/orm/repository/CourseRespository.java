package com.study.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.orm.entity.Course;

public interface CourseRespository extends JpaRepository<Course,Long>{

}
