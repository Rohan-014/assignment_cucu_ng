package FillUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F_F {
	
	WebDriver driver;
	
	@Given("open the browser, enter the simple from url")
	public void open_the_browser_enter_the_simple_from_url() {
		
		driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/simple-form?");
	    
	}

	@When("users enter the first_name,second_name,email,contact_no,message")
	public void users_enter_the_first_name_second_name_email_contact_no_message() {
		
		driver.findElement(By.id("firstName")).sendKeys("rohan");
		
		driver.findElement(By.id("lastName")).sendKeys("salunkhe");
		
		driver.findElement(By.id("email")).sendKeys("salunkhe@gmail.com");
		
		driver.findElement(By.id("number")).sendKeys("1234567890");
		
		driver.findElement(By.cssSelector("textarea[rows=\"2\"]")).sendKeys("i am not");
	   
	}

	@When("clicking on submit button")
	public void clicking_on_submit_button() {
		
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
	   
	}

	@Then("I validate pop up thank you message")
	public void i_validate_pop_up_thank_you_message() {
		
		String alert = driver.switchTo().alert().getText();
		
		if(alert.contains("tThank You")) {
			
			System.out.println("pass");
		}
		
		
	    
	}

	@Then("clicking on ok button")
	public void clicking_on_ok_button() {
		
		driver.switchTo().alert().accept();
	   
	}


}
