package com.example.springusingini;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class SpringDemo {
	
	@RequestMapping("/hi")
	public String spring()
	{
		return "hello world !!";
	}

}
