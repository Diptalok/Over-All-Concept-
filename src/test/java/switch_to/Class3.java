package switch_to;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom2.frame;

public class Class3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File file = new File("./practice/frame2.xlsx/");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		String sname = book.getSheetName(0);
		Sheet sheet = book.getSheet(sname);
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(4);
		String URL = cell.getStringCellValue();
		driver.get(URL);
		frame frm = new frame(driver);
		WebElement fram = frm.getFr();
		driver.switchTo().frame(fram);
		frm.getTxt().sendKeys("successful");
		driver.switchTo().parentFrame();
		frm.getCli().click();
		WebElement fram1 = frm.getPfr();
		driver.switchTo().frame(fram1);
		WebElement fram2 = frm.getSfr();
		driver.switchTo().frame(fram2);
		frm.getTB().sendKeys("successful");
		for(int i = 0;i<2;i++) {
			driver.switchTo().parentFrame();
		}
		frm.getScf().click();

	}

}
