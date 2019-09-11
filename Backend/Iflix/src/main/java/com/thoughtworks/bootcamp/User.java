package com.thoughtworks.bootcamp;

public class User {
	
	private String userName;
	private String password;
	
	public User( String userName, String password) {
		// TODO Auto-generated constructor stub
	
		this.userName=userName;
		this.password=password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
public boolean equals(Object object)
{
	if(!(object instanceof User) )
	{
		return false;	
	}
	User that = (User) object;
    return ((this.userName == that.userName) && (this.password == that.password )) ;
}
	
	

}
