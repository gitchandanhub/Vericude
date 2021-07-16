package Execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Utility.NumberReader;

public class practice 
{
       WebDriver driver;
	@Test
	public void droptest() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Phantom_workspace\\Vericuda\\Driver\\87Driver\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--incognito");
         DesiredCapabilities capabilities = DesiredCapabilities.chrome();
         capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		  driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.navigate().to("https://qa.vericuda.net/");
		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='Username']"))));
		WebElement uname = driver.findElement(By.xpath("//*[@id='Username']"));
		uname.sendKeys("shiva06051981@gmail.com");
		//driver.findElement(By.id("Username")).sendKeys("sshiva@pisoftek.com");
		driver.findElement(By.id("Password")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app/div/main/div/form/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app/header/nav/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/div/main/div[1]/button[1]")).click();
		Thread.sleep(5000);
		WebElement site = driver.findElement(By.id("site"));
		Select slt = new Select(site);
		try
		{
		slt.selectByVisibleText("PISTest");
		}
		catch(Exception e)
		{
			System.out.println(e);
		slt.selectByIndex(1);
		}
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.id("formStatusImage"));
		img.sendKeys("D:\\profile pics\\wallpaper.png");
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='SelectResize_small']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement are = driver.findElement(By.id("area"));
		Select sl = new Select(are);
		sl.selectByVisibleText("aa");
		Thread.sleep(2000);
		driver.findElement(By.id("NonConformanceDetails")).sendKeys("chandan");
		Thread.sleep(2000);
		WebElement pricau = driver.findElement(By.id("primary-cause"));
		Select st = new Select(pricau);
		st.selectByVisibleText("Operations Issue");
		Thread.sleep(2000);
		WebElement comcau = driver.findElement(By.id("CommonCause"));
		Select selt = new Select(comcau);
		selt.selectByVisibleText("Equipment Design");
		Thread.sleep(2000);
		WebElement prt = driver.findElement(By.id("Priority"));
		Select selet = new Select(prt);
		selet.selectByVisibleText("Major");
		Thread.sleep(2000);
		driver.findElement(By.id("MaintenanceNeeded")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AssignedTo-1")).click();
		Thread.sleep(2000);
		WebElement adimg = driver.findElement(By.id("formStatusImage"));
		adimg.sendKeys("D:\\profile pics\\wallpaper.png");
		Thread.sleep(2000);
		driver.findElement(By.id("DateVerified")).sendKeys("22112020");
		WebElement qsbtn =  driver.findElement(By.xpath("/html/body/app/div/main/div/form/button"));
		System.out.println(qsbtn.getText());
		//disConnectInternet();
		//WebElement qsbtn2 =  driver.findElement(By.xpath("/html/body/app/div/main/div/form/button"));
		//System.out.println(qsbtn2.getText());
	}
	protected void disConnectInternet() throws IOException 
	{
		Map map = new HashMap();
		map.put("offline", true);
		map.put("latency", 5);
		map.put("download_throughput", 500);
		map.put("upload_throughput", 1024);


		CommandExecutor executor = ((ChromeDriver)driver).getCommandExecutor();
		Response response = executor.execute(
		        new Command(((ChromeDriver)driver).getSessionId(), "setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));

		}
}
