package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
		public  static WebDriver driver;
		
		public  static void getDriver( String browsername) {
			if (browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if (browsername.equalsIgnoreCase("InternetExplorer")) {
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
			}else {
				System.out.println("invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		
		public static void launchUrl(String url) {
			driver.get(url);
			System.out.println("testing git");
		}
		
		public static void quit() {
			driver.quit();
			System.out.println("work done by B perf1");
		}
		
		public static void click(WebElement element) {
			element.click();

		}
		
		public static String text(WebElement element) {
			String text = element.getText();
			return text;
		}
		
		public static void passtxt(WebElement element,String text) {
			element.sendKeys(text);

		}
		
		public static String getExcel(String name, int row, int cell) throws FileNotFoundException, IOException {
		
			Workbook w = new XSSFWorkbook(new FileInputStream(new File("D:\\path\\saucedemo.xlsx")));
			int type = w.getSheet(name).getRow(row).getCell(cell).getCellType();
			if(type==1) {
				return  w.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
				}
			else {
				return String.valueOf((long)w.getSheet(name).getRow(row).getCell(cell).getNumericCellValue());
			}
		}
		
		
		
		
		
		
		
	
}
