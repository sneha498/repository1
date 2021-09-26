package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Cardpage {
     WebDriver driver;
	
	@FindBy (xpath="//button[@id='continue-shopping']")
	private WebElement continueShoppingButton;
	
	@FindBy(xpath="//button[@id='checkout1']")
	private WebElement checkout;
	
		public void verifycontinuebutton(WebDriver driver) throws InterruptedException
	{
		 WebElement a = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
		 Thread.sleep(3000);
		 a.isDisplayed();
		a.click();
		
	}
		
	
	
	
    
	
	
	

}
