package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HopperController {

	@GetMapping("")
	public String hopper(Model model) {
		
		String name = "Grace Hopper";
		String item = "Copper wire";
		double price = 5.25;
		String des = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("name", name);
		model.addAttribute("item", item);
		model.addAttribute("price", price);
		model.addAttribute("des", des);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}
}
