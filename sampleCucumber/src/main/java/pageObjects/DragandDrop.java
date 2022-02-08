package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDrop {
	WebDriver driver;
	public DragandDrop(WebDriver driver)
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
	
	@FindBy(xpath="//a[normalize-space()='Drag & Drop Sliders']")
	WebElement DragDrop;
	public WebElement ClickDragAndDrop()
	{
		return DragDrop;
	}
	
	@FindBy(xpath="//div[@id='slider3']/div/input[@class='sp__range']")
	WebElement range;
	public WebElement changeRange()
	{
		return range;
	}
	
	@FindBy(xpath="//div[@id='slider3']/div/output[@id='rangeSuccess']")
	WebElement verifyRange;
	public WebElement VerifyRange()
	{
		return verifyRange;
	}
	
}
