package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Ops")

public class DevOps {
	
	@GetMapping(value="/dev")
	
	public String devOps() {
		return "It is devOps";
	}

}
