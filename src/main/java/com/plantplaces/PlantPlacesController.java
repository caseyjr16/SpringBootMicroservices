package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
//handle the / start endpoint 

 *
 * @author Administrator
 * @return hhh
 */
@Controller
public class PlantPlacesController {

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		
		return "start";
	}
	
@PostMapping("/start")	
public String create() {
		
	
		return "start";
	}

	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}


