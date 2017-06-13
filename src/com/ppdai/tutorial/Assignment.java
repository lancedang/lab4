package com.ppdai.tutorial;

public class Assignment extends GradedItem {
	private String specification;
	private String data;

	/**
	 * 
	 * @param name
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param specification
	 * @param data
	 */
	public Assignment(String name, int month, int day, int hour, int minute,
			String specification, String data) {
		super(name, month, day, hour, minute);
		this.specification = specification;
		this.data = data;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		/*
		 * char[] labChar = specification.toCharArray(); labChar[0] -= 32;
		 * String lab = String.valueOf(labChar);
		 */

		return super.toString() + ": specification = "
				+ specification.toLowerCase() + ".pdf; data source = " + data
				+ ".csv";
	}
}
