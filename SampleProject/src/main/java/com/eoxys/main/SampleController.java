package com.eoxys.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {
	
	@GetMapping(value="/")
	public String requestEmpty() {
		return "Hello, empty data";
	}
	
	@GetMapping(value="/test1")
	public String testRequest() {
		return "Hello, test1 data";
	}
	
	@GetMapping(value="/conflict1")
	public String conflict1Request() {
		return "Hello, conflict1 data";
	}
	
	@GetMapping(value="/conflict2")
	public String conflict2Request() {
		return "Hello, conflict2 data";
	}
	
	@GetMapping(value="/newConflict")
	public String conflictNewRequest() {
		return "Hello, conflictNew data";
	}

}
