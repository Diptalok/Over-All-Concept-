package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class window {


	public window(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.=\"SwitchTo\"]")
	private WebElement swt;
	
	
	@FindBy(xpath="//a[.=\"Windows\"]")
	private WebElement win;
	
	@FindBy(xpath="//button[.=\"    click   \"]")
	private WebElement cl;
	
	@FindBy(xpath="//a[.=\"Open Seperate Multiple Windows\"]")
	private WebElement cli;
	
	@FindBy(xpath="//button[.=\"click \"]")
	private WebElement clic;
	

	public WebElement getClic() {
		return clic;
	}

	public WebElement getCli() {
		return cli;
	}

	public WebElement getCl() {
		return cl;
	}

	public WebElement getSwt() {
		return swt;
	}

	public WebElement getWin() {
		return win;
	}
	
}
