package com.webtest.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenShotUtil {

//	public static void takeScreenshot(String screenPath, WebDriver driver) {
//		try {
//			File scrFile = ((TakesScreenshot) driver)
//					.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(scrFile, new File(screenPath));
//		} catch (IOException e) {
//			System.out.println("Screen shot error: " + screenPath);
//			Reporter.log("该错误可以查看截图：" + screenPath);
//		}
//	}
//
//	public static void takeScreenshot(WebDriver driver) {
//		Date date = new Date();
//		String sj = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(date);
//		String screenName = sj + ".jpg";
//		File dir = new File("test-output/snapshot");
//		if (!dir.exists())
//			dir.mkdirs();
//		String screenPath = dir.getAbsolutePath() + "/" + screenName;
//		takeScreenshot(screenPath, driver);
//	}
	

}
