package com.itenze.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itenze.entity.Person;
import com.itenze.entity.PersonDTO;
import com.itenze.service.PersonService;

@RestController
public class RestNitController {
	
	@Autowired
	private PersonService personService;

	
	//createuuuuuOmoilll
	@PostMapping("/person")
	public String savePersonObject(@RequestBody PersonDTO personDTO) {
		Strin s1 = 1;
		String s2 = 2;
		String result = personService.savePersonDate(personDTO);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 
	//Read
	@GetMapping("/person/{id}")
	public Person getPersonDataById(@PathVariable int id) {
		return  personService.getPerson(id);
	}
	//@RequestMapping(value="/updaterole")
	@RequestMapping(value="/updaterole", method = RequestMethod.GET)
	public String updateUserRole(@RequestParam("role")  String role, @RequestParam("id") int id) {
		return personService.updatePersonRole(role, id);
	}

	*/
	
}
