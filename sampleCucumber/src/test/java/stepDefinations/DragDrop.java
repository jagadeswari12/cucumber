package stepDefinations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyRunner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DragandDrop;

public class DragDrop extends TestRunner {

	public RemoteWebDriver driver = this.connection;
	@Given("^Open LambdaTests Selenium Playground$")
	public void open_LambdaTests_Selenium_Playground() throws Throwable {
		
			driver.get("https://www.lambdatest.com/selenium-playground/");
	}
DragandDrop d;
	@Given("^click Drag & Drop Sliders under Progress Bars & Sliders$")
	public void click_Drag_Drop_Sliders_under_Progress_Bars_Sliders() throws Throwable {
	   d= new DragandDrop(driver);
	   d.ToolTip().click();
	   d.ClickDragAndDrop().click();
	   
	}
	WebElement e;
	@Given("^Select the slider Default value (\\d+)$")
	public void select_the_slider_Default_value(int arg1) throws Throwable {
		 e =d.changeRange();
		
	}

	@When("^drag the bar to make it (\\d+) by$")
	public void drag_the_bar_to_make_it_by(int arg1) throws Throwable {
		Actions move = new Actions(driver);
	    Action action = (Action) move.dragAndDropBy(e, 102, 0).build();
	     action.perform();
	}

	@Then("^validating whether the range value shows (\\d+)$")
	public void validating_whether_the_range_value_shows(int arg1) throws Throwable {
	   String range= d.VerifyRange().getText();
	   if(range.equalsIgnoreCase("95"))
	     {
	    	 System.out.println("selected correctly");
	     }
	     else
	     {
	    	 System.out.println(" Not selected");
	     }
	     driver.close();	
	}

}
