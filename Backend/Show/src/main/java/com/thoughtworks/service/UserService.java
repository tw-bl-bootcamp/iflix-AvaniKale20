package com.thoughtworks.service;

import com.thoughtworks.dto.UserDto;
import com.thoughtworks.response.Response;

public interface UserService {

	Response login(UserDto userDto);

}
