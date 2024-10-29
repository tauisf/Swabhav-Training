package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private Student students;
	private IStuedntService studentService;
	
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStuedntService.class);
		students = new Student(studentService);
	}
	
	@Test
	void testGetPercentage() {
		Mockito.when(studentService.getMarks()).thenReturn(500);
		Mockito.when(studentService.GetSubjectNumber()).thenReturn(10);
		assertEquals(50,students.getPercentage());
	}

}
