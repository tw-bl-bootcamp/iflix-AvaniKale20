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

		if (user.isPresent()) {
			if (user.get().getPassword().equals(userDto.getPassword()))

				return new Response(200, "sucessfully login");
			else {
				return new Response(400, "password invalid");
			}
		}
		return new Response(400, "not valid user");
	}

}
