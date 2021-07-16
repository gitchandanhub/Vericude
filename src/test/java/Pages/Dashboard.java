package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.AppDriver;

public class Dashboard extends AppDriver
{
	public Dashboard()
    {
    	PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[2]/a") WebElement observation;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/div/button")  WebElement out;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[1]/a") WebElement home;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[2]/a")  WebElement dashboard;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[3]/a")  WebElement create;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[4]/a")  WebElement report;
	@FindBy(xpath = "/html/body/app/header/nav/div/div/ul/li[5]/a")  WebElement privacy;
	@FindBy(xpath = "/html/body/app/div/main/div[1]/button[1]") WebElement addobservationbutton;
	@FindBy(xpath = "/html/body/app/div/main/div[1]/button[2]") WebElement reload;
	@FindAll (value = { @FindBy (xpath = "/html/body/app/div/main/div[3]/table/tbody/tr/td[2]")}) WebElement obIds;
	
	public void clickobservation() throws InterruptedException
	{
		observation.click();
		log.info("Observation link is clicked");
		System.out.println("Observation link is clicked");
		Thread.sleep(3000);
	}
	
	public void logout() throws InterruptedException
	{
		out.click();
		log.info("logout button is clicked");
		System.out.println("logout button is clicked");
		Thread.sleep(3000);
	}
	public void Clickhome()
	{
		home.click();
		log.info("home link is clicked");
		System.out.println("home link is clicked");
	}
	
	public void clickdashboard()
	{
		dashboard.click();
		log.info("dashboard link is clicked");
		System.out.println("dashboard link is clicked");
	}
	public void clickcreate()
	{
		create.click();
		log.info("create link is clicked");
		System.out.println("create link is clicked");
	}
	public void clickreport()
	{
		report.click();
		log.info("report link is clicked");
		System.out.println("report link is clicked");
	}
	public void clickprivacy()
	{
		privacy.click();
		log.info("privacy link is clicked");
		System.out.println("privacy link is clicked");
	}
	public void clickaddobservation()
	{
		addobservationbutton.click();
		log.info("add observation button is clicked");
		System.out.println("add observation button is clicked");
	}
	public void clickreload()
	{
		reload.click();
		log.info("reload button is clicked");
		System.out.println("reload button is clicked");
	}
	
	public void Edit(int ID)
	{
		List<WebElement> listids = (List<WebElement>) obIds;
		List<WebElement> editids = driver.findElements(By.xpath("/html/body/app/div/main/div[3]/table/tbody/tr/td[3]"));
		for(int i = 1; i<listids.size()+1; i++)
		{
			String oid = listids.get(i).getText();
			int orgid = Integer.parseInt(oid);
			if(orgid==ID)
			{
				editids.get(i).click();
			}
		}
	}
}
