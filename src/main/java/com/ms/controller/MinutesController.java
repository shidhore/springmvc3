package com.ms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ms.model.Activity;
import com.ms.model.Exercise;

@Controller
public class MinutesController {
	
	// method before adding @ModelAttribute for getting minutes from jsp
	/*@RequestMapping(value = "/addMinutes")
	public String addMinutes() {
		System.out.println("==== addMinutes ====");
		return "addMinutes";
	}*/

	// @ModelAttribute annotation value must be same as that of commandName attribute value in jsp
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exerciseBinding") Exercise exercise) {
		System.out.println("==== addMinutes ====");
		System.out.println(">> exercise minutes = " + exercise.getMinutes());
		return "addMinutes";
	}

	// Method for returning view as json; ties to content negotiation section inside servlet-config.xml
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		Activity run = new Activity();
		run.setDescription("Run");
		activities.add(run);
		Activity bike = new Activity();
		bike.setDescription("Bike");
		activities.add(bike);
		return activities;
	}

}
