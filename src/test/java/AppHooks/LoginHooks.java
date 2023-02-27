package AppHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LoginHooks {
	
	@Before(order = 1)
	public void openbrowser(){
		System.out.println("Opens Chrome Browser");
	}
	
	@Before(order=2)
	public void browserUrl() {
		System.out.println("Url is Loaded");
	}
	
	@After(order = 2)
	public void teardown() {
		System.out.println("Login from the application");
	}
	@After(order = 1)
	public void Closed() {
		System.out.println("Browser Closed");
	}
	

}
