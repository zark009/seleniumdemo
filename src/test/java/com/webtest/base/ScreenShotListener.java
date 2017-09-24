package com.webtest.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class ScreenShotListener extends TestListenerAdapter {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	public static WebDriver driver;

	@Override
	public void onStart(ITestContext testContext) {

		super.onStart(testContext);
	}

	@Override
	public void onFinish(ITestContext testContext) {

		super.onFinish(testContext);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		logger.info("TestSuccess:");
		super.onTestSuccess(tr);
		// try {
		// takeScreenShot(tr);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

	@Override
	public void onTestFailure(ITestResult tr) {
		logger.info("TestFailure:");

		super.onTestFailure(tr);
		try {
			takeScreenShot(tr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShot(ITestResult tr) throws IOException {
		Date date = new Date();
		String sj = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
		String fileName = tr.getName() + "_" + sj + ".png";
		File dir = new File("test-output/snapshot");
		if (!dir.exists())
			dir.mkdirs();
		String screenPath = dir.getAbsolutePath() + "/" + fileName;
		try {
			File srcFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			// 把截图拷贝到自定义的目录
			FileUtils.copyFile(srcFile, new File(screenPath));
		} catch (IOException e) {
			System.out.println("Screen shot error: " + screenPath);
			Reporter.log("该错误可以查看截图：" + screenPath);
		}
	}

}
