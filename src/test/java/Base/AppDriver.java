package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utility.wait;

public class AppDriver
	{
	     public static WebDriver driver = null;
	     public static Properties config = new Properties();
	     public static Logger log=Logger.getLogger("devpinoyLogger");
	     public static ExtentHtmlReporter htmlreporter;
	     public static ExtentReports extentreport;
	     public static ExtentTest extenttest; 
	     @BeforeTest
	      public void Initialize() throws Exception {
	    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    	   LocalDateTime now = LocalDateTime.now();  
	    	   String x = dtf.format(now);
	    	   htmlreporter = new ExtentHtmlReporter("D:\\Software\\Phantom_workspace\\Vericuda\\Report\\Steriaresult.html");
	    	  //htmlreporter = new ExtentHtmlReporter(config.getProperty("ExtentReport_path")+"Steriaresult"+dtf.format(now)+".html");
	    	     
	    	     htmlreporter.config().setEncoding("utf-8");
	    	     htmlreporter.config().setDocumentTitle("Automation Test");
	    	     htmlreporter.config().setReportName("Automation result");
	    	     htmlreporter.config().setTheme(Theme.STANDARD);      
	    	      extentreport = new ExtentReports();
	    	      extentreport.setSystemInfo("Organization", "way2testing");    
	    	    extentreport.attachReporter(htmlreporter);    
	    	  FileInputStream fis = new FileInputStream("D:\\Software\\Phantom_workspace\\Vericuda\\src\\test\\java\\Property\\config.properties");
	    	  config.load(fis);
	    	  if(config.getProperty("BrowserName").equalsIgnoreCase("Chrome"))
	    	  {
	    		  
	    		  System.setProperty("webdriver.chrome.driver", config.getProperty("Chropath"));
	              System.setProperty("webdriver.chrome.silentOutput", "true");
	              ChromeOptions options = new ChromeOptions();
	              options.addArguments("--incognito");
	              DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	              capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    		  driver = new ChromeDriver(capabilities);
	    	  }
	    	  else  if(config.getProperty("BrowserName").equalsIgnoreCase("Firefox"))
	          {
	       	   System.setProperty("webdriver.gecko.driver", config.getProperty("FireFoxDriver_path"));
	       	   driver = new FirefoxDriver();
	          }
	          else  if(config.getProperty("BrowserName").equalsIgnoreCase("IE"))
	          {
	       	   System.setProperty("webdriver.internetExplorer.driver", config.getProperty("InternetExplorerpath"));
	       	   driver = new InternetExplorerDriver();
	          }
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(wait.Implicitwait, TimeUnit.SECONDS);
	          driver.navigate().to(config.getProperty("Url"));
	          Thread.sleep(15000);
	      
	      }
	      
	      @AfterTest
	      public void close()
	      {
	    	  extentreport.flush();
	    	 // driver.quit();
	      }
	
}
