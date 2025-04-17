package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import util.BrowserInvoke;
import util.ReadPropertyData;

public class Steps {
	
	WebDriver driver;
	
	@Given("User wants to open browser")
	public void user_wants_to_open_browser() throws Exception {
	    
		driver=BrowserInvoke.openBrowser(ReadPropertyData.readData("/src/main/resources/config.properties", "url"));
	}

	@Then("User enters url")
	public void user_enters_url() {
	    
	    LoginPage lp=new LoginPage(driver);
	    lp.login();
	}

	@When("User login to the application")
	public void user_login_to_the_application() {
	    
	    String s=driver.getTitle();
	    System.out.println(s);
	}

	@And("Validate login is successful")
	public void validate_login_is_successful() {
	    
	   driver.quit();
	}


}
