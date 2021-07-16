package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.AppDriver;

public class Login extends AppDriver
{
	public Login()
    {
    	PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(id = "Username") WebElement username;
	@FindBy(id = "Password")  WebElement pwd;
	 WebDriverWait wait;   
	 
	
	
	@FindBy(xpath = ".//*[@class = 'btn btn-primary']")  WebElement loginbutton;
	
	
	public void Enterusername(String uname)
	{
		     wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOfAllElements(username));
			username.clear();
			username.sendKeys(uname);
			log.info("Username Entered");
			System.out.println("Username Entered");
	
	}
	
	public void EnterPassword(String pawd)
	{
		
			pwd.clear();
			pwd.sendKeys(pawd);
			log.info("Password Entered");
			System.out.println("Password Entered");
		
		
	}
	public void PressLogin() throws InterruptedException
	{
		loginbutton.click();
		log.info("Login button pressed");
		System.out.println("Login button is pressed");
		Thread.sleep(3000);
	}
}
