package T1_demo_Shop;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import demo_Shop.End_To_End_POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class End_To_End {
	
	public static void main(String[] args) throws Exception {
		File file = new File("./practice/Demo_Shop.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheetAt(0);
		String name = sheet.getSheetName();
		Sheet Esheet = book.getSheet(name);
		String URL = Esheet.getRow(4).getCell(1).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		End_To_End_POM con = new End_To_End_POM(driver);
		con.getLog_In().click();
		String UN = Esheet.getRow(7).getCell(2).getStringCellValue();
		con.getEmail().sendKeys(UN);
		String PASS = Esheet.getRow(11).getCell(3).getStringCellValue();
		con.getPassword().sendKeys(PASS);
		con.getSub().click();
		

	}

}
