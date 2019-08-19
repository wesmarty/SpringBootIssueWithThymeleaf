package com.eor.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/fluidReservoirProperties")
public class FluidReservoirProperties {
	private static final String map = "fluidReservoirProperties";
	
	@RequestMapping("/list")
	public String list() {
		return  "testing";
	}
}
