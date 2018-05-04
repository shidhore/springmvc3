package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
