package com.ppdai.tutorial;

import java.util.ArrayList;
import java.util.List;

public class GradedItemList {
	private List<GradedItem> gradedItems;

	/**
	 * 
	 */
	public GradedItemList() {
		// TODO Auto-generated constructor stub
		gradedItems = new ArrayList<GradedItem>();
	}

	public void addItem(GradedItem gradedItem) {
		this.gradedItems.add(gradedItem);
	}

	public double averageGrade() {
		double sum = 0.0;
		for (GradedItem item : gradedItems) {
			sum += item.getGrade();
		}
		return sum / gradedItems.size();
	}

	/**
	 * Must add get method, or can't visit gradeditems elements
	 * 
	 * @param index
	 * @return
	 */
	public GradedItem get(int index) {
		return this.gradedItems.get(index);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder resultBuilder = new StringBuilder("");

		for (GradedItem item : gradedItems) {
			resultBuilder.append(item.toString());
			resultBuilder.append("\n");
		}

		return resultBuilder.toString();
	}

}
