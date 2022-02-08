package stepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import MyRunner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InputForm;

public class InputFormSubmit extends TestRunner {

	public RemoteWebDriver driver = this.connection;

	@Given("^Open the lambdatest selenium-playground page$")
	public void open_the_lambdatest_selenium_playground_page() throws Throwable {
		
		driver.get("https://www.lambdatest.com/selenium-playground/");
	}
     InputForm i ;
	@Given("^click Input Form Submit under Input Forms$")
	public void click_Input_Form_Submit_under_Input_Forms() throws Throwable {
	    i=new InputForm(driver);
	    i.ClickInputFormSubmit().click();
	    
	}

	@Given("^Click Submit without filling in any information in the form$")
	public void click_Submit_without_filling_in_any_information_in_the_form() throws Throwable {
	    i.ClickSubmit().click();
	}

	@Given("^Assert \"([^\"]*)\" error message$")
	public void assert_error_message(String arg1) throws Throwable {
		WebElement ele = i.Name();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ActualTitle = (String)js.executeScript("return arguments[0].validationMessage;", ele);
		String ExpectedTitle= "Please fill out this field." ;
	}

	@Given("^Fill in Name, Email, and other fields$")
	public void fill_in_Name_Email_and_other_fields() throws Throwable {
	    i.Name().sendKeys("Jagadeswari");
	    i.Email().sendKeys("ramireddyjagadeswari@gmail.com");
	    i.Password().sendKeys("pass@123");
	    i.Company().sendKeys("lambda");
	    i.Website().sendKeys("https://www.lambdatest.com/");
	    Select city =  new Select(i.Country());
		city.selectByVisibleText("United States");
	    i.City().sendKeys("Ananthapur");
	    i.Address1().sendKeys("11/12-01 , BKM street");
	    i.Address2().sendKeys("opposite to savthri hospital");
	    i.State().sendKeys("AndhraPradeshi");
	    i.Zip().sendKeys("515002");
	  
	    
	}

	@When("^click Submit$")
	public void click_Submit() throws Throwable {
		  i.ClickSubmit().click();
	}

	@Then("^Once submitted, validate the success message \"([^\"]*)\"$")
	public void once_submitted_validate_the_success_message(String arg1) throws Throwable {
	  String actualSuccessMsg =	i.SuccessMsg().getText();
	  Assert.assertEquals(arg1, actualSuccessMsg);
	  driver.close();
		
	}   
}
