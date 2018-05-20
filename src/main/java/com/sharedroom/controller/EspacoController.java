/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.controller;

import org.springframework.stereotype.Controller;



@Controller
public class EspacoController {

//	private OrganizationService organizationService;
	
	
	public String listOrganizationUsingSQLTag() {
		return "listOrganization1";
	}
	
	/*@RequestMapping("/espacos")
	public String listOrganizationUsingService(Model model) {
		List<Organization> orgs = organizationService.getOrganization();
		model.addAttribute("orgList", orgs);
		return "listOrganization2";
	}*/

}

