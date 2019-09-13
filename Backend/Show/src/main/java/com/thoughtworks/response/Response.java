package com.thoughtworks.response;


import org.springframework.stereotype.Component;

@Component
public class Response {

	private int statusCode;
	private String statusMsg;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

}

