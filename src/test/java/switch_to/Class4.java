package switch_to;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom3.Slider;

public class Class4 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File file = new File("./practice/wid.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url1");
		driver.get(URL);
		Slider sd = new Slider(driver);
		Actions act = new Actions(driver);
		act.clickAndHold(sd.getSLD()).moveByOffset(190, 0).release().perform();
		act.moveToElement(sd.getMo()).perform();
		act.moveToElement(sd.getMo2()).perform();
		act.moveToElement(sd.getMo3()).click().perform();
		WebElement DRAG = sd.getDrg();
		WebElement DROP = sd.getDrp();
		act.dragAndDrop(DRAG, DROP).perform();
		WebElement DRAG1 = sd.getDrg1();
		act.dragAndDrop(DRAG1, DROP).perform();
		WebElement DRAG2 = sd.getDrg2();
		act.dragAndDrop(DRAG2, DROP).perform();
	}

}
