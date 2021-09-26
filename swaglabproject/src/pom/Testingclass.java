package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Testingclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation testing\\chromedriver_win32\\chromedriver.exe\\");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 loginpage  loginpage = new  loginpage(driver);
		 loginpage.verifyTitle(driver);
		 loginpage.username();
		 loginpage.passname();
		 loginpage.clickSignInButton();
		 
		 homepage homepage = new homepage(driver);
		 homepage.verifyProduct(driver);
		 homepage. vws();
		 homepage.dds();
		 homepage. ppd();
		 homepage.verifyCartCount("3");
		 Thread.sleep(1000);
		 homepage.removeitem();
		 Thread.sleep(1000);
         homepage.verifyCartCount("2");
         
         homepage.dropdown(2);
         homepage.verifydropdown(driver,"PRICE (LOW TO HIGH)");
         Thread.sleep(2000);
         homepage.dropdown(1);
         homepage.verifydropdown(driver,"NAME (Z TO A)");
         Thread.sleep(3000);
         homepage.dropdown(3);
         homepage.verifydropdown(driver, "PRICE (HIGH TO LOW)");
         
         homepage.clickcardbutton();
         homepage.verifyCartCount("2");
         
         Cardpage cardpage = new Cardpage();
         cardpage.verifycontinuebutton(driver);
        Thread.sleep(3000);
        homepage.verifyProduct(driver);
        homepage.additem();
        homepage.verifyCartCount("3");
        homepage.clickcardbutton();
      
        
      
		//driver.close();
		//driver.quit(); 
		
		
	}
}
