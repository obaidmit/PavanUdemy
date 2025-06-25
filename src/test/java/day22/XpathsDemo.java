package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input#name")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input#email")).sendKeys("ABC@a.com");
		driver.findElement(By.cssSelector("input#phone")).sendKeys("32948329483249");
		driver.findElement(By.cssSelector("textarea#textarea")).sendKeys("IT Professional ");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		//scroll to element
		WebElement targetEle=driver.findElement(By.xpath("//label[text()='Country:']"));
		JavascriptExecutor  js= (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true)", targetEle);
		
		//dropDown country
		WebElement drpDown=driver.findElement(By.xpath("//select[@id='country']"));
		Select countryD=new Select(drpDown);
		countryD.selectByValue("india");
		
		//dropDown color
		WebElement ddcolor=driver.findElement(By.xpath("//select[@id='colors']"));
		Select color=new Select(ddcolor);
		color.selectByVisibleText("White");
		
		//dropDown animal
		WebElement ddanimal=driver.findElement(By.xpath("//select[@id='animals']"));
		Select animal=new Select(ddanimal);
		animal.selectByVisibleText("Giraffe");
		
		//DateBox
		WebElement datepick1=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepick1.sendKeys("08/21/2005");
		datepick1.sendKeys(Keys.TAB);
		
		WebElement datepick2=driver.findElement(By.xpath("//input[@id='txtDate']"));
		datepick2.sendKeys("08/12/2006");
		datepick2.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
	}

}
