package com.ms.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	// tied to minutes in addGoal.jsp
	@Range(min = 1, max = 120)
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
