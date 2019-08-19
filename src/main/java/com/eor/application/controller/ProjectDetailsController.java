package com.eor.application.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eor.application.modal.ProjectDetails;
import com.eor.application.repository.ProjectDetialsRepository;

@Controller
public class ProjectDetailsController {
	private static final String map = "projectDetails";
	
	@Autowired
	private ProjectDetialsRepository projectDetailsRepository;

	@RequestMapping(value = "/")
	public String createProject(@ModelAttribute("projectDetails") ProjectDetails details, Model model) {
		model.addAttribute("projectDetails", new ProjectDetails());
		return map + "/create";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		Direction direction = Direction.DESC;
		List<ProjectDetails> projectList = projectDetailsRepository.findAll(Sort.by(direction, "DateCreated"));
		model.addAttribute("projectListInstance", projectList);
		return map+"/list";
	}

	@RequestMapping(value = "/projectDetails/save")
	public String save(@ModelAttribute("projectDetails") ProjectDetails details,Model model,RedirectAttributes redirectAttributes) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		details.setDateCreated(ts);
		projectDetailsRepository.save(details);
		System.out.println(details.getId());
		return map+"/input";
	}
	
	@RequestMapping("/delete/{Id}")
	public String delete(@PathVariable("Id") Integer id) {
		projectDetailsRepository.deleteById(id);
		return "redirect:/list";
	}
}
