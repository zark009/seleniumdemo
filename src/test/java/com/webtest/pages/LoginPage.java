package com.webtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.LoadableComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webtest.base.BasePage;

public class LoginPage {

	private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);
	
	public WebDriver driver;
	
	private String pageName="TMS登录页";
	/*元素定位*/
	@FindBy(name = "q")
	@CacheLookup
	private WebElement search;
	
	/*元素定位*/
	@FindBy(id = "search-button")
	@CacheLookup
	private WebElement searchBt;

	String url = "http://www.haosou.com/";

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//name=pageName;
		logger.info("driver初始化....");
		logger.info("准备访问"+pageName+"....");
		PageFactory.initElements(driver, this);

	}




	
	public void load() {
		if (null != driver) {
			logger.info("访问url:" + url);
			driver.get(url);
		}

	}

	public void close() {
		if (null != driver) {
		logger.info("浏览器关闭......");
		driver.close();
		}
	}



	public void search() {
		logger.info("定位"+search.toString()+"输入框");
		search.sendKeys("dsadas");
		logger.info("点击"+searchBt.toString()+"按钮");
		searchBt.click();

	}


	



}
