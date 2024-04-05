package demo_Shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class End_To_End_POM {
	public End_To_End_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.=\"Log in\"]")
	private WebElement Log_In;

	public WebElement getLog_In() {
		return Log_In;
	}
	
	@FindBy(name="Email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(name="Password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	private WebElement Submit;

	public WebElement getSub() {
		return Submit;
	}



}
