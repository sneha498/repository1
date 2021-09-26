package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homepage {
	

	private static final String verifyFilter = null;

	@FindBy (xpath ="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement Addcart;
	
	@FindBy (xpath ="(//button[@class='btn btn_primary btn_small btn_inventory'])[2]")
	private WebElement Addcart2 ;
	
	@FindBy (xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[3]")
	private WebElement Addcart3;
	
	//@FindBy (xpath = "//a[@class='shopping_cart_link']")
	//private WebElement clickbs;
	
	@FindBy (xpath ="//span[@class='title']")
	private WebElement verifyProductTitle;
	
	@FindBy (xpath ="//span[@class='shopping_cart_badge']")
	private WebElement cartCount;
	
	@FindBy (xpath ="(//button[@class='btn btn_secondary btn_small btn_inventory'])[1]")
	private WebElement removeProduct;
	
	@FindBy(xpath ="//select[@class='product_sort_container']")
	private WebElement dropDown;
	
	@FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement additem;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filter;
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement Card;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement Addtocard;
	
	
	
	public homepage (WebDriver driver)
	
	{
		PageFactory .initElements(driver, this);
	
    }
	public void verifyProduct(WebDriver driver)
	{
		String productxt = verifyProductTitle.getText();
		System.out.println("product - "+productxt);
		Assert.assertEquals(productxt, "PRODUCTS");	
	}
	public void vws()
	{
		Addcart.click();
	}
	public void dds()
	{
		Addcart2.click();
	}
	public void ppd()
	{
		Addcart3.click();
	}
	
	/*public void ppds()
	{
		clickbs.click();
	}*/
	
	public void verifyCartCount(String str)
	{

		String Count = cartCount.getText().trim();
		System.out.println("count - "+ Count);
		Assert.assertEquals(Count, str);
	}

	public void removeitem()
	{
		removeProduct.click();
	}
	
	public void dropdown(int index)
	{
		dropDown.click();
		Select s = new Select (dropDown);
		s.selectByIndex(index);
	}
	public void verifydropdown(WebDriver driver, String ddlActualValue)
	{
		// List<WebElement> myList=driver.findElements(By.className("accordion-toggle"));
		String s = driver.findElement(By.xpath("//span[@class='active_option']")).getText();
		System.out.println("ddlValue - "+ s);
		Assert.assertEquals(s, ddlActualValue);
	}
	public void clickcardbutton()
	{
		Card.click();
	}
	 
	public void additem()
	{
		Addtocard.click();
	}
	
	
	
	
	
	
	
}
