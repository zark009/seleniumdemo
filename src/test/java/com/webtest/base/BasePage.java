package com.webtest.base;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static final String MAIN_TITLE = "XXX平台";
	 public WebDriver driver;
	 public String title;
	        private final int TIMEOUT = 10;

	        public BasePage() {}

	        public BasePage(WebDriver driver) {
	            this.driver = driver;
	            PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT) , this);
	            
	        }

	        public BasePage(WebDriver driver, final String title) {
	            this.driver = driver;
	            this.title = title;
	            try{
	         new WebDriverWait(driver,TIMEOUT).until(new ExpectedCondition<Boolean>(){
	        	 
	                public Boolean apply(WebDriver arg0) {
	              	     String acttitle = arg0.getTitle();
	                    return acttitle.equals(title);                    
	                }});
	        }catch(TimeoutException te) {
	            throw new IllegalStateException("当前页面title(" + driver.getTitle() + ")与预期("+ title +")不一致");
	        }
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT) , this);
	    }

	

}