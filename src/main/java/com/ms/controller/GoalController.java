package com.ms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ms.model.Goal;

@Controller
@SessionAttributes("goal") // this should match to attribute name you want to store in session
public class GoalController {

	// @ModelAttribute annotation value must be same as that of commandName attribute value in jsp
	@RequestMapping(value = "/addGoal", method = RequestMethod.GET)
	public String addGoalMinutes(Model model) {
		System.out.println("==== addGoalMinutes ====");
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		System.out.println(">> goal minutes = " + goal.getMinutes());
		return "addGoal";
	}

	// @ModelAttribute annotation value must be same as that of commandName attribute value in jsp
	@RequestMapping(value = "/addGoal", method = RequestMethod.POST)
	public String updateGoalMinutes(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		System.out.println("hasErrors = " + result.hasErrors());
		if (result.hasErrors()) {
			return "addGoal";
		}
		System.out.println("==== updateGoalMinutes ====");
		System.out.println(">> goal minutes updated = " + goal.getMinutes());
		return "redirect:addMinutes.html";
	}

}
