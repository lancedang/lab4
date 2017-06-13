package com.ppdai.tutorial;

public class Exam extends GradedItem {
	private String problemSet;

	/**
	 * 
	 * @param name
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param problemSet
	 */
	public Exam(String name, int month, int day, int hour, int minute,
			String problemSet) {
		super(name, month, day, hour, minute);
		this.problemSet = problemSet;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return super.toString() + ": problem set = "
				+ super.getName().toLowerCase() + ".pdf";
	}
}
