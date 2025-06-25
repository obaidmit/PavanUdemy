package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//id
//name
//linkText
//partialLinkText
//
//TagName
//classname
//
//CSS selector
//XPath
public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> list_links= driver.findElements(By.className("widget-content"));
		System.out.println(list_links.size());
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println(all_links.size());
		
		
		//driver.close();

	}

}
