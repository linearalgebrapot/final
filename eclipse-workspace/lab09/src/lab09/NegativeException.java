package lab09;

public class NegativeException extends Exception{
	//String messsage;
	
	public NegativeException() {
		super();
	}
	
	public NegativeException(String message) {
		super(message);
	}
	
	public String getMessage() {
		return "work time must be positive";
	}

}
