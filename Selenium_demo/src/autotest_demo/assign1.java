package autotest_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Santosh Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		WebElement username = driver.findElement(By.name("userName"));
		
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("sunil");
			
		}
		
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@href='reservations.php']/a")).click();
			Thread.sleep(3000);
		}

	}

}
