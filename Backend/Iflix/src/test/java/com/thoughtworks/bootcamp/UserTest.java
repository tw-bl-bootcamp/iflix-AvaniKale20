package com.thoughtworks.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

	
	@Test
	void givenUsernameAndPassword_WhenLogined_ThenLogIn()
	{
		User presentUser= new User("avanikale2@gmail.com","avani123");
		Assertions.assertEquals(presentUser, (new User("avanikale2@gmail.com","avani123")));
		
	}
	

}
