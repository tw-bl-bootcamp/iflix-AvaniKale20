package com.thoughtworks.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResponseTokenTest {

	@Test
	void givenValidUserNameAndPassWord_WhenLogined_ThenReturnResponse()
	{
		ResponseToken response=new ResponseToken("Successfull",200);
		Assertions.assertEquals(response, (new ResponseToken("Successfull",200)));
		
	}
	@Test
	void givenInvalidNameAndPassWord_WhenLogined_ThenReturnIvalidResponse()
	{		
		ResponseToken response=new ResponseToken("Successfull",200);
        Assertions.assertNotEquals(response, response.response());
    }

}
