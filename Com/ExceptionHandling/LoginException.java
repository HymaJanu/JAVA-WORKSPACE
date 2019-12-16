package Com.ExceptionHandling;

public class LoginException {

		String message;

		public LoginException(String message) {
			super();
			
			System.out.println();
		}

		@Override
		public String toString() {
			return "LoginException [message=" + message + "]";
		}
		
	
	
}

