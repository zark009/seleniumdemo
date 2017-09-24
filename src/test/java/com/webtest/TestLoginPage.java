package com.webtest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.webtest.base.ScreenShotListener;
import com.webtest.pages.LoginPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Listeners({ ScreenShotListener.class })
public class TestLoginPage  {
	
	private static final Logger logger = LoggerFactory.getLogger(TestLoginPage.class);
	
	public static WebDriver driver;

	@Test
	public void test_login_page_01() {
		String caseContent="xxxxx功能验证1";
		logger.info(caseContent);
		LoginPage page=new LoginPage(driver);
		page.load();
		page.search();
		page.close();
	}

	@Test
	public void test_login_page_02() {
		String caseContent="xxxxx功能验证2";
		logger.info(caseContent);
		LoginPage page= new LoginPage(driver);
		page.load();
		
		page.close();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		logger.info("开始2222222222222");
		driver=new FirefoxDriver();
		ScreenShotListener.driver=driver;
		driver.manage().window().maximize();
		
		
	}
	

	@AfterMethod
	public void afterMethod() {
		logger.info("结束2222222222222");
		driver.quit();
	}

}
