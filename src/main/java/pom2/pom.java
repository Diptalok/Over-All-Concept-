package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	public pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.=\"SwitchTo\"]")
	private WebElement sw;
	
	@FindBy(xpath="//a[.=\"Alerts\"]")
	private WebElement al;
	
	@FindBy(xpath="//button[@onclick=\"alertbox()\"]")
	private WebElement cl;
	
	@FindBy(xpath="//a[.=\"Alert with OK & Cancel \"]")
	private WebElement al2;
	
	@FindBy(xpath="//button[.=\"click the button to display a confirm box \"]")
	private WebElement al3;
	
	@FindBy(xpath="//a[.=\"Alert with Textbox \"]")
	private WebElement alt;
	
	@FindBy(xpath="//button[@onclick=\"promptbox()\"]")
	private WebElement alt2;
	
	public WebElement getAlt2() {
		return alt2;
	}


	public void setAlt2(WebElement alt2) {
		this.alt2 = alt2;
	}


	public WebElement getAlt() {
		return alt;
	}


	public void setAlt(WebElement alt) {
		this.alt = alt;
	}


	public WebElement getAl2() {
		return al2;
	}


	public void setAl2(WebElement al2) {
		this.al2 = al2;
	}


	public WebElement getAl3() {
		return al3;
	}


	public void setAl3(WebElement al3) {
		this.al3 = al3;
	}


	public WebElement getCl() {
		return cl;
	}


	public void setCl(WebElement cl) {
		this.cl = cl;
	}


	public WebElement getAl() {
		return al;
	}


	public void setAl(WebElement al) {
		this.al = al;
	}


	public WebElement getSw() {
		return sw;
	}
	

	public void setSw(WebElement sw) {
		this.sw = sw;
	}
	
	

}
