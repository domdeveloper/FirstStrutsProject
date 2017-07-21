package actions;

public class HelloAction {

	private String greeting;
	
	public String execute() {
		
		greeting = "Hello!";
		
		return "success";
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
