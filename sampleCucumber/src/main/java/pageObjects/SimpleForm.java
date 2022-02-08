package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleForm {

	WebDriver driver;
	public SimpleForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="span[class='cookie__bar__close hover:underline smtablet:hidden']")
	WebElement toolTip;
	public WebElement ToolTip()
	{
		return toolTip;
	}
	
	@FindBy(xpath="//a[normalize-space()='Simple Form Demo']")
	WebElement simpleFormDemo;
	public WebElement ClickSimpleFormDemo()
	{
		return simpleFormDemo;
	}
	
	@FindBy(id="user-message")
	WebElement enterMesage;
	public WebElement EnterMesage()
	{
		return enterMesage;
	}
	
	@FindBy(id="showInput")
	WebElement getCheckedValue;
	public WebElement ClickGetCheckedValue()
	{
		return getCheckedValue;
	}
	
	@FindBy(id="message")
	WebElement verifyMsg;
	public WebElement YourMessage()
	{
		return verifyMsg;
	}
	
}
