package domain;

public class Post {
	private User user;
	private String message;
	
	public Post(String message, User user)
	{
		this.message = message;
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String toString()
	{
		return user.getName() + " sent " + message; 
	}
}
