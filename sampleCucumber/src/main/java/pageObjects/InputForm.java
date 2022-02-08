package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputForm {

	WebDriver driver;
	public InputForm(WebDriver driver)
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
	
	@FindBy(xpath="//a[normalize-space()='Input Form Submit']")
	WebElement inputFormSubmit;
	public WebElement ClickInputFormSubmit()
	{
		return inputFormSubmit;
	}
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	public WebElement ClickSubmit()
	{
		return submit;
	}
	
	@FindBy(id="name")
	WebElement name;
	public WebElement Name()
	{
		return name;
	}
	
	@FindBy(id="inputEmail4")
	WebElement email;
	public WebElement Email()
	{
		return email;
	}
	@FindBy(css="#inputPassword4")
	WebElement password;
	public WebElement Password()
	{
		return password;
	}
	@FindBy(css="#company")
	WebElement company;
	public WebElement Company()
	{
		return company;
	}
	
	@FindBy(xpath="//input[@id='websitename']")
	WebElement website;
	public WebElement Website()
	{
		return website;
	}
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	public WebElement Country()
	{
		return country;
	}
	@FindBy(xpath="//input[@id='inputCity']")
	WebElement city;
	public WebElement City()
	{
		return city;
	}
	@FindBy(id="inputAddress1")
	WebElement address1;
	public WebElement Address1()
	{
		return address1;
	}
	@FindBy(id="inputAddress2")
	WebElement address2;
	public WebElement Address2()
	{
		return address2;
	}
	
	@FindBy(css="#inputState")
	WebElement state;
	public WebElement State()
	{
		return state;
	}
	@FindBy(css="#inputZip")
	WebElement zip;
	public WebElement Zip()
	{
		return zip;
	}
	
	@FindBy(xpath="//p[@class='success-msg hidden']")
	WebElement successMsg;
	public WebElement SuccessMsg()
	{
		return successMsg;
	}
}
