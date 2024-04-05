package switch_to;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import pom2.window;

public class Class2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		File file = new File("./practice/switchprop.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		window win = new window(driver);
		WebElement SW = win.getSwt();
		Actions act = new Actions(driver);
		act.moveToElement(SW).perform();
		win.getWin().click();
		String URL1 = prop.getProperty("url3");
		driver.navigate().to(URL1);
		win.getCl().click();
		String windID = driver.getWindowHandle();
		Set<String> windIDs = driver.getWindowHandles();
		for (String window : windIDs) {
			if(!windID.equals(window)) {
				driver.switchTo().window(window);
				JavascriptExecutor je = (JavascriptExecutor)driver;
				je.executeScript("window.scrollBy(0,9000)");
			}
		}
		driver.switchTo().window(windID);
		driver.navigate().to(URL1);
		win.getCli().click();
		win.getClic().click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		for (String w : windowIDs) {
			driver.switchTo().window(w);
			String TITLE = driver.getTitle();
			if(TITLE.contains("Index")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("done");
		for (String w : windowIDs) {
			driver.switchTo().window(w);
			String TITLE = driver.getTitle();
			if(TITLE.contains("Frames & windows")) {
				break;
			}
		}
	}
}
