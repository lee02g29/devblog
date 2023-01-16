package com.perdy.devblog.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
class mainController {

	@GetMapping("/hello")
	@ResponseBody
	public List<String> hello(@RequestParam("name") String name) {
		return Arrays.asList("안녕하세요.", name);
	}
}
