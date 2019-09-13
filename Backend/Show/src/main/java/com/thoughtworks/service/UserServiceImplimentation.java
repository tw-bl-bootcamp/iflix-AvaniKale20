package com.thoughtworks.service;

import com.thoughtworks.dto.UserDto;
import com.thoughtworks.model.UserModel;
import com.thoughtworks.repository.UserRepository;
import com.thoughtworks.response.Response;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImplimentation implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Response login(UserDto userDto) {
		// TODO Auto-generated method stub
		Optional<UserModel> user = userRepository.findByEmailId(userDto.getEmailId());

		Response response = new Response();
		if (!user.isEmpty()) {
			response.setStatusCode(200);
			response.setStatusMsg("login Successfully");
			return response;

		}
		return response;
	}

}
