package com.skcet.day1.fav;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fav {
	@Value("Blue")
	public String colour;
	@GetMapping("/Fav")
     public String display()
     {
    	 return "My favourite colour is "+colour;
     }
}

