package mavenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriWebpage {

	//public static void main(String[] args) throws InterruptedException, AWTException {
		
	
		@Test
		void driverSetup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//String url="https://www.naukri.com/mnjuser/profile";
				String url="https://www.naukri.com/";
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
				JavascriptExecutor js= (JavascriptExecutor)driver;
		
		
		
		
		
		
		
		
		driver.findElement(By.id("login_Layer")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("mdobaidarif98@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Shaannaukri@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='View']")).click();
		
		Thread.sleep(4000);
		WebElement resumeName=driver.findElement(By.xpath("//div[@class='resume-name-inline']"));
		System.out.println(resumeName.getText());
		
		WebElement beforeFileDate=driver.findElement(By.xpath("//div[@class='updateOn typ-14Regular']"));
		System.out.println(beforeFileDate.getText());
		
	
		////input[@id='attachCV']
		////input[@value='Update resume']
		WebElement resumeUpload=driver.findElement(By.xpath("//input[@id='attachCV']"));
		resumeUpload.sendKeys("D:\\Automation Resume Obaid\\MdObaidullah_resumeLeaf.pdf");
		
		//js.executeScript("arguments[0].value='D:\\Resume Obaid QA\\MdObaidullah_resumeLeaf.pdf';", resumeUpload);
		
		
		
		//String filePath= Paths.get(System.getProperty("user.dir")+"\\testData\\MdObaidullah_resumeLeaf.pdf").toString();
		//driver.findElement(By.xpath("//input[@value='Update resume']")).sendKeys("C:\\Users\\hp\\Eclipse-workspace\\seleniumlearn\\testData\\MdObaidullah_resumeLeaf.pdf");
		
		WebElement AfterResumeName=driver.findElement(By.xpath("//div[@class='resume-name-inline']"));
		System.out.println("Latest Resume:    "+AfterResumeName.getText());
		
		WebElement uplodeFileDate=driver.findElement(By.xpath("//div[@class='updateOn typ-14Regular']"));
		System.out.println(uplodeFileDate.getText());
		
		
		
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		}
		
		
		
		
	//}

}
