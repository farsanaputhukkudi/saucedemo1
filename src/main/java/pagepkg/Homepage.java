package pagepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath="//button[@class='btn_primary btn_inventory']")
	List<WebElement> addtocart;
	
	@FindBy(xpath="//a[@href='./cart.html']")
	WebElement cartbutton;
	
	@FindBy(xpath="//a[@href='./checkout-step-one.html']")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
    @FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
	WebElement menu;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	public void addtocart()
	{
		for(WebElement e:addtocart)
		{
			e.click();
		}
	}
	public void clickcart()
	{   
		WebDriverWait ob=new WebDriverWait(driver,Duration.ofSeconds(10));
	ob.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='./cart.html']")));
		cartbutton.click();
	}
	public void checkout()
	{
		checkout.click();
	}
	public void fill(String fname,String lname,String code)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(code);
		continuebutton.click();
	}
		public void logout()
		{
			driver.navigate().back();
			menu.click();
			logout.click();
			
		}
	
	}
	

