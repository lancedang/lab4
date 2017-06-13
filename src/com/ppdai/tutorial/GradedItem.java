package com.ppdai.tutorial;

public class GradedItem {
	private String name;
	private double grade;
	private int month;
	private int day;
	private int hour;
	private int minute;

	public GradedItem(String name, int month, int day, int hour, int minute) {
		super();
		this.name = name;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String month = this.month > 9 ? String.valueOf(this.month) : "0"
				+ this.month;
		String day = this.day > 9 ? String.valueOf(this.day) : "0" + this.day;
		String hour = this.hour > 9 ? String.valueOf(this.hour) : "0"
				+ this.hour;
		String minute = this.minute > 9 ? String.valueOf(this.minute) : "0"
				+ this.minute;

		String gradeString = String.format("%.2f", this.grade);

		return String.format("%s (date: %s-%s at %s:%s): grade = %s",
				this.name, month, day, hour, minute, gradeString);
	}
}
