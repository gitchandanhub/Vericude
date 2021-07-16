package Execution;

import java.awt.AWTException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.AppDriver;
import Pages.Addobservation;
import Pages.Dashboard;
import Pages.Login;
import Utility.NavigateUrl;
import Utility.Verifylinks;
import org.testng.annotations.Listeners;

@Listeners(Listen.TestNG_Listeners.class)
public class TestCases extends AppDriver
{
	
	    @Test(priority = 0)
	    public void VerifyLogin() throws InterruptedException
	    {
	    	Login lgn = new Login();
	    	lgn.Enterusername(config.getProperty("Username"));
	   
	    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	lgn.EnterPassword(config.getProperty("Password"));
	    
	    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	lgn.PressLogin();
	    	Thread.sleep(5000);    	
	    }  
	    @Test(priority = 1)
	    public void addobser() throws InterruptedException
	    {
	    	Dashboard  dbrd =  new Dashboard();
	    	dbrd.clickobservation();
	    	dbrd.clickaddobservation();
	    	Thread.sleep(5000);      	
	    	Addobservation ado = new Addobservation();
	    	ado.selectsite("PISTest");
	    	Thread.sleep(1000); 
	    	ado.selectstatusimage("D:\\Diamond.jpg");
	    	Thread.sleep(1000); 
	    	ado.selectArea("aa");
	    	Thread.sleep(1000); 
	    	ado.noncondet("This is non confidential details");
	    	Thread.sleep(1000);
	    	ado.Selectprimarycause("Operations Issue");
	    	Thread.sleep(1000);
	    	ado.selectcommoncause("Equipment Design");
	    	Thread.sleep(1000);
	    	ado.selectpriority("Major");
	    	Thread.sleep(1000);
	    	ado.maintenanceneededchkbox();
	    	Thread.sleep(1000);
	    	ado.Selectassignedto("sshiva@pisoftek.com");
	    	Thread.sleep(1000);
	    	ado.EnterCorrection("Nice correction");
	    	Thread.sleep(1000);
	    	ado.EnterAuditorcomment("My comment");
	    	Thread.sleep(1000);
	    	ado.Enterdate("23102020");
	    	System.out.println("Enter time with in 10 sec");
	    	Thread.sleep(10000);
	    	ado.clicksavebtn();
	    	ado.clicksavebtn();
	    	ado.clicksavebtn();
	    	}
	    //@Test(priority = 2)
	    public void dashbord() throws InterruptedException
	    {
	    	Dashboard  dbrd =  new Dashboard();
	    	dbrd.Clickhome();
	    	try
	    	{
	    		
	    		dbrd.logout();
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	
	    }
	    
	   
	 // @Test(priority = 3)
	   public void Editpro() throws InterruptedException, AWTException
	   {
		   
		  
	   }
	  // @Test(priority = 4, dependsOnMethods = "Editpro")
	   public void logouttext() throws InterruptedException
	   {
		   
		   
	   }
	   
	//  @Test(priority = 5)
	   public void clientlogin() throws InterruptedException, AWTException
	   {
		   	   }
      //@Test(priority = 0)
      public void verifylinks() throws IOException, InterruptedException
      {
    	 
    	  
      }
      /*@Test(priority = 1)
      public void verifyContact() throws InterruptedException
      {
    	  ContactUs con = new ContactUs();
    	  con.opencontactpage();
    	  con.EnterName(config.getProperty("Name"));
    	  con.EnterEmail(config.getProperty("Email"));
    	  con.Entermobile(config.getProperty("Mobile"));
    	  con.EnterDetail(config.getProperty("Details"));
    	  con.clicksubmit();
    	  con.getmsg();
    	  con.navigatehome();
      }*/
}
