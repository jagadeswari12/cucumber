package stepDefinations;

import org.openqa.selenium.remote.RemoteWebDriver;

import MyRunner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SimpleForm;

public class SimpleFormDemo extends TestRunner {
	public RemoteWebDriver driver = this.connection;
	@Given("^Open LambdaTests Selenium Playground from$")
	public void open_LambdaTests_Selenium_Playground_from() throws Throwable {
		
		driver.get("https://www.lambdatest.com/selenium-playground/");
	}
        SimpleForm s ;
	@Given("^Click Simple Form Demo under Input Forms$")
	public void click_Simple_Form_Demo_under_Input_Forms() throws Throwable {
		s= new SimpleForm(driver);
		s.ToolTip().click();
		s.ClickSimpleFormDemo().click();
	}

	@Given("^Validate that the URL contains simple-form-demo$")
	public void validate_that_the_URL_contains_simple_form_demo() throws Throwable {
		 String url=driver.getCurrentUrl();
		    
	      if(url.contains("simple-form-demo")) {
	System.out.println(" VerifyUrl ");}
	      else {
	    	  System.out.println("wrong url");
	      }
	}
String msg;
	@Given("^Create a variable to enter values in the Enter Message text box$")
	public void create_a_variable_to_enter_values_in_the_Enter_Message_text_box() throws Throwable {
		 msg ="Welcome to LambdaTest";
	      s.EnterMesage().sendKeys(msg);
	}

	@When("^Click Get Checked Value$")
	public void click_Get_Checked_Value() throws Throwable {
		 s.ClickGetCheckedValue().click();
	}

	@Then("^Validate whether the same text message is displayed under the Your Message section$")
	public void validate_whether_the_same_text_message_is_displayed_under_the_Your_Message_section() throws Throwable {
		String actual = s.YourMessage().getText();
		 if(actual.equalsIgnoreCase("msg"))
	     {
	    	 System.out.println("Displayed correctly");
	     }
	     else
	     {
	    	 System.out.println("Wrong display");
	     }
		 driver.close();
	}
	

}
