package lab09;

public class TooMuchStuffException extends Exception{
	private int inputNum;
	
	public TooMuchStuffException() {
		super();
	}
	
	public TooMuchStuffException(int inputNum) {
		super();
		this.inputNum = inputNum;
	}
	
	public int getInputNum() {
		return inputNum;
	}
	
	public String getMessage() {
		return "Too much stuff!";
	}

}
