package com.itenze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itenze.entity.Person;
import com.itenze.entity.PersonDTO;
import com.itenze.entity.UserRole;
import com.itenze.repository.PersonRepository;
import com.itenze.repository.UserRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public String savePersonDate(PersonDTO dto) {
		
		Person entity = new Person();
		entity.setId(dto.getId());
		entity.setUsername(dto.getUsername());
		entity.setPassword(dto.getPassword());
		
		UserRole userRole = userRepo.findByRoleName(dto.getRole());
		
		if (userRole != null) {
			entity.setRole(userRole);
		}else {
			return "Role Not found";
		}
		
		entity = personRepo.save(entity);
		if(entity != null)
			return "Data Insert Succesfully";
		return "Some Problem Occured";
	}

	/*@Override
	public Person getPerson(int id) {
		
		Person person = personRepo.findById(id).get();
		
		return person;
	}*/

/*	@Override
	public String updatePersonRole(String role, int id) {
		Integer reslt = personRepo.updateUserRole(role, id);
		
		if(reslt > 0)
			return "Data update Succesfully";
		return "Some problem ocuured";
	}*/

}
