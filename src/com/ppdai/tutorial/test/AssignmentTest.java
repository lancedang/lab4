package com.ppdai.tutorial.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ppdai.tutorial.Assignment;

public class AssignmentTest {

	@Test
	public void testToString() {
		Assignment assignment = new Assignment("Lab 1", 8, 26, 23, 59, "lab1",
				"calendar");
		assignment.setGrade(0.50);

		assertEquals(
				"Lab 1 (date: 08-26 at 23:59): grade = 0.50: specification = lab1.pdf; data source = calendar.csv",
				assignment.toString());
	}

}
