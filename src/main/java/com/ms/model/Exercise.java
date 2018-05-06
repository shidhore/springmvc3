package com.ms.model;

public class Exercise {
	// tied to minutes in addMinutes.jsp
	private int minutes;
	// tied to activity in addMinutes.jsp
	private String activity;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
