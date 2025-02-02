package day1;

public class InvalidPasswordException extends RuntimeException{
	
	
	private String message;
	
	
	InvalidPasswordException(String message){
		
		this.message= message;
	}
	
	
@Override
	public String getMessage() {
		return message;
		
	}

}