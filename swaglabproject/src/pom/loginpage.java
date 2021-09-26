package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginpage {

	
	
	@FindBy (xpath ="//input[@placeholder='Username']")
		private WebElement username;
		
		@FindBy (xpath ="//input[@placeholder='Password']")
		private WebElement password;
		
 		@FindBy (xpath = "//input[@id='login-button']")
		private WebElement clickbutton;
		
		
		public loginpage (WebDriver driver)
		
		{
			PageFactory .initElements(driver, this);
		
	    }
		public void username()
		{
			username.sendKeys("standard_user");
		}
		public void passname()
		{
			password.sendKeys("secret_sauce");
		}
		public void clickSignInButton()
		{
			clickbutton.click();
		}
		
		public void verifyTitle(WebDriver driver)
		{
			String tittle = driver.getTitle();
			System.out.println("title =="  +tittle);
			Assert.assertEquals(tittle, "Swag Labs");
		}
		
		
}
