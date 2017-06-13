package com.ppdai.tutorial.test;

import org.junit.Assert;
import org.junit.Test;

import com.ppdai.tutorial.GradedItem;

/**
 * Example test class for the GradedItem class. Tests for GradedItem.getGrade()
 * and GradedItem.toString() have been provided, but you will need to write
 * other tests in order to achieve 100% coverage of the GradedItem class.
 * 
 * @author Nicholas Sidwell
 * @version 2016-09-11 Lab 4
 */
public class GradedItemTest {
	/**
	 * Tests GradedItem.getGrade() to ensure that it is returning the expected
	 * value.
	 * 
	 * Steps for testing:
	 * 
	 * 1. Create objects and initialize necessary variables to perform your
	 * test. 2. Run the method(s) you are testing. 3. Assert that the correct
	 * values are being returned, or that the methods are mutating data as
	 * expected.
	 * 
	 * Note: For many things you are testing, steps two and three could be
	 * combined, i.e. Assert.assertEquals(expected, foo.getBaz());
	 */
	@Test
	public void gradedItemGetGradeTest() {
		// Create GradedItem object.
		GradedItem item = new GradedItem("Homework", 12, 15, 7, 36);

		// Initialize the grade value for testing.
		item.setGrade(0.69);

		/*
		 * Test that the value returned by GradedItem.getGrade() is the same as
		 * the one that was passed to GradedItem.setGrade().
		 */
		Assert.assertEquals(0.69, item.getGrade(), 0.1);
	}

	/**
	 * Tests GradedItem.toString() to ensure that it is returning the properly
	 * formatted string representation of the instance of the class.
	 * 
	 * Steps for testing:
	 * 
	 * 1. Create objects and initialize necessary variables to perform your
	 * test. 2. Run the method(s) you are testing. 3. Assert that the correct
	 * values are being returned, or that the methods are mutating data as
	 * expected.
	 * 
	 * Note: For many things you are testing, steps two and three could be
	 * combined, i.e. Assert.assertEquals("expected value", foo.toString());
	 */
	@Test
	public void gradedItemToStringTest() {
		// Create GradedItem object.
		GradedItem item = new GradedItem("Homework", 12, 5, 7, 6);
		GradedItem item2 = new GradedItem("Homework", 2, 15, 7, 6);

		// Initialize the grade value for testing.
		item.setGrade(0.69);
		item2.setGrade(0.69);

		Assert.assertEquals("Homework (date: 12-05 at 07:06): grade = 0.69",
				item.toString());
		Assert.assertEquals("Homework (date: 02-15 at 07:06): grade = 0.69",
				item2.toString());
	}
}
