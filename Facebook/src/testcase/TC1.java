package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
	
	WebDriver driver;
	
	@Test 
	public void TC111()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("test");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[2]/a")).click();
		System.out.println("test");

	}

}
