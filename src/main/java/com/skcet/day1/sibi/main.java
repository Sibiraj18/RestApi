package com.skcet.day1.sibi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class main {
@GetMapping("/Welcome")
public String Welcome()
{
	return "Welcome String Boot";
}
}
