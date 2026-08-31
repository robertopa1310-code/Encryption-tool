package model;

public class Message {
	
	private byte[] Message;
	private String password;

	public byte[] getMessage() {
		return Message;
	}

	public void setMessage(byte[] message) {
		Message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}