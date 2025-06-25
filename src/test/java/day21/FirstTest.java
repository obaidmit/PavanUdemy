package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Case Passed.");
			
		}
		else
		{
			System.out.println("Case Failed.");
		}
		
		driver.close();

	}

}
