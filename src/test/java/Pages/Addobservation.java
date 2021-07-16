package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.AppDriver;


public class Addobservation extends AppDriver
{
	public Addobservation()
	{
		PageFactory.initElements(driver, this);
	}
   Select slt;
	@FindBy(id = "site")  WebElement Selectsite;
	@FindBy(xpath = "//*[@id='formStatusImage']")  WebElement statusimage;
	@FindBy(xpath = "//*[@id='SelectResize_small']") WebElement smallsize;
	@FindBy(id = "add-status-image") WebElement addImagebtn;
	@FindBy(id = "area")  WebElement area;
	@FindBy(id = "NonConformanceDetails") WebElement nonconfdetail;
	@FindBy(id = "primary-cause") WebElement primarycause;
	@FindBy(id = "CommonCause") WebElement commoncause;
	@FindBy(id = "Priority") WebElement priority;
	@FindBy(id = "MaintenanceNeeded") WebElement maintenanceneeded;
	@FindAll(@FindBy (xpath = "//*[@id='AssignedTo']/div/label")) WebElement chkboxvalue;
	@FindAll(@FindBy (xpath  = ".//*[starts-with(@id, \"AssignedTo\") and @class = 'form-check-input']")) WebElement assignedtochkbox;
	@FindBy(id = "CorrectiveActionTaken") WebElement correctiveActtokentext;
	@FindBy(id = "formStatusImage") WebElement correctiveActtokenimage;
	@FindBy(id = "AuditorComments") WebElement auditorverification;
	@FindBy(id = "DateVerified") WebElement dateverified;
	@FindBy(xpath = "/html/body/app/div/main/div/form/button")  WebElement quicksavebtn; 
	
	public void selectsite(String text) throws InterruptedException
	{
		WebElement selectsite = driver.findElement(By.id("site"));
		slt = new Select(selectsite);
		try
		{
			slt.selectByVisibleText(text);
		}
		catch(Exception e)
		{
			System.out.println(e);
			slt.selectByIndex(1);
		}
		log.info("Site has been selected");
		System.out.println("Site has been selected");
		Thread.sleep(1000);
	}
	
	public void selectstatusimage(String imgpath) throws InterruptedException
	{
		WebElement addimagebtn = driver.findElement(By.id("formStatusImage"));
		try
		{
			addimagebtn.sendKeys(imgpath);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			statusimage.sendKeys(imgpath);
		}
		Thread.sleep(1000);
		log.info("image has been selected");
		System.out.println("image has been selected");
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		smallsize.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}
	public void selectArea(String are) throws InterruptedException
	{
		WebElement ara = driver.findElement(By.id("area"));
		slt = new Select(ara);
		try
		{
			slt.selectByVisibleText(are);
		}
		catch(Exception e)
		{
			try
			{
				slt.selectByValue(are);
			}
			catch(Exception e2)
			{
				System.out.println(e2);
				slt.selectByIndex(2);
			}
		}
		
		log.info("Area has been selected");
		System.out.println("Area has been selected");
		Thread.sleep(1000);
	}
	public void noncondet(String text) throws InterruptedException
	{
		nonconfdetail.clear();
		nonconfdetail.sendKeys(text);
		log.info("Non confidential text has been entered");
		System.out.println("Non confidential text has been entered");
		Thread.sleep(1000);
	}
	public void Selectprimarycause(String cause) throws InterruptedException
	{
		WebElement pricau = driver.findElement(By.id("primary-cause"));
		Select pc = new Select(pricau);
		pc.selectByVisibleText(cause);
		log.info("primary cause has been Entered");
		System.out.println("primary cause has been Entered");
		Thread.sleep(1000);
	}
	public void selectcommoncause(String ccaus) throws InterruptedException
	{
		WebElement comcau = driver.findElement(By.id("CommonCause"));
		Select cc = new Select(comcau);
		cc.selectByVisibleText(ccaus);
		log.info("Common cause has been entered");
		System.out.println("Common cause has been entered");
		Thread.sleep(1000);
	}
	public void selectpriority(String prty) throws InterruptedException
	{
		WebElement prt = driver.findElement(By.id("Priority"));
		Select sp = new Select(prt);
         sp.selectByVisibleText(prty);
     	log.info("priority has been selected");
		System.out.println("priority has been selected");
		Thread.sleep(1000);
	}
    public void maintenanceneededchkbox() throws InterruptedException
    {
    	maintenanceneeded.click();
    	log.info("Maintenance Checkbox selected");
		System.out.println("Maintenance Checkbox selected");
		Thread.sleep(1000);
    }
    public void Selectassignedto(String assigne) throws InterruptedException
    {
    	try
    	{
    		driver.findElement(By.id("AssignedTo-1")).click();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		List<WebElement>  chkbxvalue = (List<WebElement>) chkboxvalue;
    	
    	List<WebElement>  chkbox = (List<WebElement>) assignedtochkbox;
    	for(int i = 0; i<chkbxvalue.size(); i++)
    	{
    		String valtext = chkbxvalue.get(i).getText();
    		if(valtext.equalsIgnoreCase(assigne))
    		{
    			chkbox.get(i).click();
    		}
    	}
    	log.info("Assigne has been selected");
		System.out.println("Assigne has been selected");
		Thread.sleep(1000);
    }
    }
    public void EnterCorrection(String text) throws InterruptedException 
    {
    	correctiveActtokentext.clear();
    	correctiveActtokentext.sendKeys(text);
    	log.info("Correction text has been entered");
		System.out.println("Correction text has been entered");
		Thread.sleep(1000);
    }
    
    public void SelectcorrectionImage(String path) throws InterruptedException
    {
    	correctiveActtokenimage.click();
    	correctiveActtokenimage.sendKeys(path);
    	log.info("Correction image has been selected");
		System.out.println("Correction image has been selected");
		Thread.sleep(1000);
    }
    
    public void EnterAuditorcomment(String text) throws InterruptedException
    {
    	auditorverification.clear();
    	auditorverification.sendKeys(text);
    	log.info("Auditor comment has been entered");
		System.out.println("Auditor comment has been entered");
		Thread.sleep(1000);
    }
    
    public void Enterdate(String data) throws InterruptedException
    {
    	dateverified.sendKeys(data);
    	log.info("Date has been entered");
    	System.out.println("Date has been entered");
    	Thread.sleep(1000);
    }
    public void clicksavebtn() throws InterruptedException
    {
    	quicksavebtn.click();
    	log.info("Save button is pressed");
		System.out.println("Save button is pressed");
		Thread.sleep(1000);
    }
}
