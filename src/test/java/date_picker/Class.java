package date_picker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pom3.Date;

public class Class {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File file = new File("./practice/wid.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		Date dt = new Date(driver);
		dt.getDt1().click();
		dt.getDp().click();
		dt.getDes().click();
		dt.getDt2().click();
		//dt.getDes2().click();
		WebElement opt = dt.getSel();
		opt.click();
        opt.sendKeys(Keys.DOWN);
		dt.getDt3().click();

	}

}
