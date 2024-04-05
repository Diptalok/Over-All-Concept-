package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Date {
	public Date (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id=\"datepicker1\"]")
	private WebElement dt1;

	public WebElement getDt1() {
		return dt1;
	}
	
	@FindBy (xpath="//a[.=\"18\"]")
	private WebElement dp;

	public WebElement getDp() {
		return dp;
	}
	
	@FindBy (xpath="//div[@id=\"ui-datepicker-div\"]/descendant::a[.=\"16\"]")
	private WebElement des;

	public WebElement getDes() {
		return des;
	}
	
	@FindBy (xpath="//input[@id=\"datepicker2\"]")
	private WebElement dt2;

	public WebElement getDt2() {
		return dt2;
	}
	
	@FindBy (xpath="//div[@class=\"datepick\"]/descendant::a[.=\"26\"]")
	private WebElement des2;

	public WebElement getDes2() {
		return des2;
	}
	
	@FindBy (xpath="//select[@title=\"Change the month\"]")
	private WebElement sel;

	public WebElement getSel() {
		return sel;
	}
	
	@FindBy (xpath="(//td/a[.=\"12\"])[2]")
	private WebElement dt3;

	public WebElement getDt3() {
		return dt3;
	}
	
	
	


	
	

}
