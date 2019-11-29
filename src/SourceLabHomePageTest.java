//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SourceLabHomePageTest {

	@Test
	public void site_header_is_on_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\MyHP\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
//		browser.get("https://www.saucelabs.com");
//		WebElement href = browser.findElement(By.xpath("//a[@href='https://app.saucelabs.com/login']"));
//		assertTrue((href.isDisplayed()));
//		browser.close();
		
		
//		browser.get("http://www.google.co.th");
//		System.out.println(browser+" is running");
//		System.out.println(""+browser.getTitle());
//		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		browser.close();
//		System.out.println("Finish !!!");
		
		browser.get("http://th.indeed.com");
		browser.findElement(By.id("text-input-what")).click();
		browser.findElement(By.id("text-input-what")).sendKeys("Selenium");
		browser.findElement(By.id("text-input-where")).click();
		browser.findElement(By.id("text-input-where")).clear();
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys(Keys.BACK_SPACE);
		browser.findElement(By.id("text-input-where")).sendKeys("Bangkok");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		String result = browser.findElement(By.id("searchCountPages")).getText();
		
		System.out.println(result);
		if(result.equalsIgnoreCase("Page 1 of 53 jobs")) 
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		

		Thread.sleep(4000);

		browser.close();
		System.out.println("Finish !!!");

	}

}
