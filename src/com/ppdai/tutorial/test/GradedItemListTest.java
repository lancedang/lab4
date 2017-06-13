package com.ppdai.tutorial.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ppdai.tutorial.Assignment;
import com.ppdai.tutorial.GradedItem;
import com.ppdai.tutorial.GradedItemList;

public class GradedItemListTest {

	@Test
	public void testAddItem() {
		GradedItem item1 = new GradedItem("item1", 1, 1, 1, 1);
		GradedItem item2 = new GradedItem("item2", 11, 11, 11, 11);
		GradedItemList list = new GradedItemList();

		list.addItem(item1);
		list.addItem(item2);

		assertEquals(item1, list.get(0));
		assertEquals(item2, list.get(1));

	}

	@Test
	public void testAverageGrade() {
		Assignment assignment = new Assignment("Lab 1", 8, 26, 23, 59, "lab1",
				"calendar");
		assignment.setGrade(0.50);

		Assignment assignment2 = new Assignment("Lab 2", 8, 6, 3, 9, "lab2",
				"calendar");
		assignment2.setGrade(0.566);

		GradedItemList list = new GradedItemList();

		list.addItem(assignment);
		list.addItem(assignment2);
		assertEquals(0.533, list.averageGrade(), 0.01);
	}

	@Test
	public void testToString() {
		Assignment assignment = new Assignment("Lab 1", 8, 26, 23, 59, "lab1",
				"calendar");
		assignment.setGrade(0.50);

		Assignment assignment2 = new Assignment("Lab 2", 8, 6, 3, 9, "lab2",
				"calendar");
		assignment2.setGrade(0.566);

		GradedItemList list = new GradedItemList();

		list.addItem(assignment);
		list.addItem(assignment2);

		assertEquals(
				"Lab 1 (date: 08-26 at 23:59): grade = 0.50: specification = lab1.pdf; data source = calendar.csv\n"
						+ "Lab 2 (date: 08-06 at 03:09): grade = 0.57: specification = lab2.pdf; data source = calendar.csv\n",
				list.toString());
	}

}
