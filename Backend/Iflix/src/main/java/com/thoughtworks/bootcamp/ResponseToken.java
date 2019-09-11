package com.thoughtworks.bootcamp;

public class ResponseToken {

	private String msg;
	private int code;

	public ResponseToken(String msg, int code ) {
		// TODO Auto-generated constructor stub
		this.code=code;
		this.msg=msg;
	}
	public boolean equals(Object object)
	{
		if(!(object instanceof ResponseToken) )
		{
			return false;	
		}
		ResponseToken that = (ResponseToken) object;
	    return ((this.msg == that.msg) && (this.code == that.code )) ;
	}
	
	ResponseToken response() {
		return new ResponseToken ("Successfull",400) ;
	}
}
