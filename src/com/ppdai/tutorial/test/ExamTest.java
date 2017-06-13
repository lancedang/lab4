package com.ppdai.tutorial.test;

import org.junit.Assert;
import org.junit.Test;

import com.ppdai.tutorial.Exam;
import com.ppdai.tutorial.GradedItem;

public class ExamTest {

	@Test
	public void testToString() {
		// Create GradedItem object.

		// Initialize the grade value for testing.
		// item.setGrade(0.69);
		Exam exam = new Exam("Homework", 12, 5, 7, 6, "bug");
		exam.setGrade(0.69);

		Assert.assertEquals(
				"Homework (date: 12-05 at 07:06): grade = 0.69: problem set = homework.pdf",
				exam.toString());
	}

}
