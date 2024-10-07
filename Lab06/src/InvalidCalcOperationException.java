
public class InvalidCalcOperationException extends Exception{
	private char operation;
	
	public InvalidCalcOperationException() {
		super("Invalid Operation");
	}
	
	public InvalidCalcOperationException(char operation) {
		this();
		setOperation(operation);
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public char getOperation() {
		return operation;
	}
	
	@Override
	public String getMessage() {
		return String.format("%s: %c was chosen", super.getMessage(), operation);
	}
	
	
}
