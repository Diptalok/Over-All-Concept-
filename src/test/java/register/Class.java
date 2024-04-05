package register;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

import pom.pom;
public class Class {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File file = new File("./practice/properties.properties/");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		driver.get(URL);
		String ADD = prop.getProperty("add");
		String MAIL = prop.getProperty("mail");
		String PH = prop.getProperty("ph");
		String CON = prop.getProperty("con");
		
		File file2= new File("./practice/excel.xlsx/");
		FileInputStream fis2 = new FileInputStream(file2);
		Workbook book = WorkbookFactory.create(fis2);
		String sh = book.getSheetName(0);
		Sheet sheet = book.getSheet(sh);
		Cell cl1 = sheet.getRow(0).getCell(0);
		String FN = cl1.getStringCellValue();
		Cell cl2 = sheet.getRow(0).getCell(1);
		String LN = cl2.getStringCellValue();
		Cell cl3 = sheet.getRow(1).getCell(0);
		String PS = cl3.getStringCellValue();
		Cell cl4 = sheet.getRow(1).getCell(1);
		String CPS = cl4.getStringCellValue();
		
		pom po = new pom(driver);
		po.getFn().sendKeys(FN);
		po.getLn().sendKeys(LN);
		po.getAdd().sendKeys(ADD);
		po.getEm().sendKeys(MAIL);
		po.getPh().sendKeys(PH);
		po.getFp().sendKeys(PS);
		po.getSp().sendKeys(CPS);
		po.getRd().click();
		po.getCb().click();
		po.getSel().click();
		po.getLan().click();
		po.getCon().sendKeys(Keys.ENTER);
		po.getInd().sendKeys(CON,Keys.ENTER);
		
		Select se = new Select(po.getDp());
		se.selectByValue("APIs");		
		
	}

}
