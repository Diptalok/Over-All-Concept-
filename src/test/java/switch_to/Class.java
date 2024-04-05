package switch_to;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom2.pom;
public class Class {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File file = new File("./practice/switchprop.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		
		pom p = new pom(driver);
		WebElement SW = p.getSw();
		Actions act = new Actions(driver);
		act.moveToElement(SW).perform();
		p.getAl().click();
		String URL2 = prop.getProperty("url2");
		driver.navigate().to(URL2);
		p.getCl().click();
		Alert ALT = driver.switchTo().alert();
		String ALTTXT = ALT.getText();
		System.out.println(ALTTXT);
		ALT.accept();
		p.getAl2().click();
		p.getAl3().click();
		Alert ALT2 = driver.switchTo().alert();
		System.out.println(ALT2.getText());
		ALT2.dismiss();
		p.getAlt().click();
		p.getAlt2().click();
		Alert ALT3 = driver.switchTo().alert();
		ALT3.sendKeys("Miku");
		ALT3.accept();
		
	}

}
