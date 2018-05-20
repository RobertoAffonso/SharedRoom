/**
 * @author Roberto Affonso Ara�jo
 *
 */
package com.sharedroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("it works");
		return "index";
	}
}

