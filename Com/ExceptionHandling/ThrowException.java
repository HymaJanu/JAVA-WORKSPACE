package Com.ExceptionHandling;

import javax.security.auth.login.LoginException;

public class ThrowException {

	public static void main(String[] args) throws LoginException{  //custom expression
	
			String username="abcd";
			if(!username.equals("abc"))
			{
				throw new LoginException("you cant enter wrong user");
			}
		}

	}


