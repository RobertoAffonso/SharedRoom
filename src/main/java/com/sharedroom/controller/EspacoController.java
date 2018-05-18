/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sharedroom.service.OrganizationService;

import exemplo.domain.Organization;

@Controller
public class EspacoController {
	@Autowired
	private OrganizationService organizationService;
	
	@RequestMapping
	public String listOrganizationUsingSQLTag() {
		return "listOrganization1";
	}
	
	@RequestMapping("/service")
	public String listOrganizationUsingService(Model model) {
		List<Organization> orgs = organizationService.getOrganization();
		model.addAttribute("orgsList", orgs);
		return "listOrganization2";
	}

}

