package com.example.demo.Controller;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;

	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {

		mapper = new ObjectMapper();
		User user = this.mapper.readValue(userJson, User.class);

		if (!validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los campos obligatorios no estan completos");
		}

		userService.save(user);

		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}

	private boolean validate(User user) {
		// Validate required attributes
		boolean isValid = true;

		if (StringUtils.isBlank(user.getFirstName())) {
			isValid = false;
		}
		if (StringUtils.isBlank(user.getFirstSurname())) {
			isValid = false;
		}
		if (StringUtils.isBlank(user.getAddress())) {
			isValid = false;
		}

		return isValid;
	}

}
