package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frame {
	public frame(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//iframe[@name=\"SingleFrame\"]")
	private WebElement fr;
	
	@FindBy (xpath = "(//input[@type=\"text\"])[1]")
	private WebElement txt;
	
	@FindBy (xpath = "//a[.=\"Iframe with in an Iframe\"]")
	private WebElement cli;
	
	@FindBy (xpath = "//iframe[@src=\"MultipleFrames.html\"]")
	private WebElement pfr;
	
	@FindBy (xpath = "(//iframe[@src=\"SingleFrame.html\"])[1]")
	private WebElement sfr;
	
	@FindBy (xpath = "(//input[@type=\"text\"])[1]")
	private WebElement tb;
	
	@FindBy (xpath = "//a[.=\"Single Iframe \"]")
	private WebElement scf;

	
	public WebElement getScf() {
		return scf;
	}
	
	public WebElement getTB() {
		return tb;
	}
	
	public WebElement getSfr() {
		return sfr;
	}
	
	public WebElement getPfr() {
		return pfr;
	}
	
	public WebElement getFr() {
		return fr;
	}
	
	public WebElement getTxt() {
		return txt;
	}
	
	public WebElement getCli() {
		return cli;
	}

}
