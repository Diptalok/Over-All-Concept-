package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider {
		public Slider (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]")
		private WebElement sld;

		public WebElement getSLD() {
			return sld;
		}
		
		@FindBy (xpath="//a[.=\"Interactions \"]")
		private WebElement mo;

		public WebElement getMo() {
			return mo;
		}
		
		@FindBy (xpath="//a[.=\"Drag and Drop \"]")
		private WebElement mo2;

		public WebElement getMo2() {
			return mo2;
		}
		
		@FindBy (xpath="//a[.=\"Static \"]")
		private WebElement mo3;

		public WebElement getMo3() {
			return mo3;
		}
		
		@FindBy (xpath="//img[@id=\"angular\"]")
		private WebElement drg;

		public WebElement getDrg() {
			return drg;
		}
		
		@FindBy (xpath="//img[@id=\"mongo\"]")
		private WebElement drg1;

		public WebElement getDrg1() {
			return drg1;
		}
		
		@FindBy (xpath="//img[@id=\"node\"]")
		private WebElement drg2;

		public WebElement getDrg2() {
			return drg2;
		}
		
		@FindBy (xpath="//div[@id=\"droparea\"]")
		private WebElement drp;

		public WebElement getDrp() {
			return drp;
		}
		
		
		
}
