package Controller;

public class Checking {
	
	public Checking() {
		super();
	}
	
	public boolean CheckingText(String text) {
		return text != null && !text.isBlank();
	}
	
}