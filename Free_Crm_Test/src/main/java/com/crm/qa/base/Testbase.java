package com.crm.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
  static WebDriver driver;
  static Properties prop;
  
  public Testbase()  {
	  try {
	  
	  prop= new Properties();
	  FileInputStream ip = new FileInputStream("C:/Users/Personal/eclipse-workspace/Free_Crm_Test/src/main/java"
	  		+ "/com/crm/qa/config/config.properties");
	  prop.load(ip);
	  
  } catch (FileNotFoundException e) {
	  
	  e.printStackTrace();
	  
	  
  }catch(IOException e) {
	  e.printStackTrace();
	  
  }
  }
	  public static void initialization1() {
		  String browserName= prop.getProperty("browser");
		  
		  if(browserName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_java\\chromedriver_win32\\chromedriver.exe");
			  driver= new ChromeDriver();
			  
		  } else if(browserName.equals("ff")) {
			  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_java\\chromedriver_win32\\chromedriver.exe");
			  driver= new FirefoxDriver();
		  }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  
		  
	  }}
  
