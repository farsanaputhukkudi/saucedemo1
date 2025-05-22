package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	public void login(String username1,String passwrd)
	{   
		username.clear();
		username.sendKeys(username1);
		password.clear();
		password.sendKeys(passwrd);
	}
	public void click() throws Exception
	{
		login.click();
	
	
	
	}
}
