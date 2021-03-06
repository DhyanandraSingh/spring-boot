package com.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.StaffDetails;
import com.boot.services.StaffService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/staff/**")
public class staffController {

	@Autowired
	StaffService staffService;
	
			// ........xxxxxx..............xxxxxxx................xxxxxxx.............//
	
			@ResponseStatus(HttpStatus.OK)
			@CrossOrigin
			@RequestMapping(value = "/", 
							method = RequestMethod.GET, 
							produces = MediaType.APPLICATION_JSON_VALUE)
			public String fetchStaff() throws JsonProcessingException {
				return new ObjectMapper().writeValueAsString(staffService.fetchAllStaff());
			}

			// ........xxxxxx..............xxxxxxx................xxxxxxx.............//

			@CrossOrigin
			@RequestMapping(value = "/{staffId}", 
							method = RequestMethod.GET, 
							produces = MediaType.APPLICATION_JSON_VALUE)
			public String fetchStaff(@PathVariable("staffId") long staffId)
					throws JsonProcessingException {
				return new ObjectMapper().writeValueAsString(staffService.fetchStaffById(staffId));
			}

			// ........xxxxxx..............xxxxxxx................xxxxxxx.............//

			@SuppressWarnings("rawtypes")
			@CrossOrigin
			@RequestMapping(value = "/", 
							method = RequestMethod.POST, 
							consumes = MediaType.APPLICATION_JSON_VALUE)
			public StaffDetails saveStaff(@RequestBody Map map) {
				ObjectMapper mapper = new ObjectMapper();
				StaffDetails staff = mapper.convertValue(map, StaffDetails.class);
				staffService.saveStaffDetails(staff);
				return staff;
			}
}
