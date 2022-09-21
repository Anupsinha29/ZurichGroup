package com.MiWay.Genericutility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementation implements ITestListener{
	private ExtentReports reports;
	public static ExtentTest stest;
	private ExtentTest test;
	
	

	@Override
	public void onTestStart(ITestResult result) {
		ExtentSparkReporter spark = new ExtentSparkReporter("./extentReport/extendReport.html");
		spark.config().setDocumentTitle("Document Title-Altair-Report");
		spark.config().setReportName("Report Name-Altair-Retro");
		spark.config().setTheme(Theme.DARK);
		
		reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("Author", "Anup Sinha");
		reports.setSystemInfo("OS", "Win 10");
		reports.setSystemInfo("Browser", "Chrome");
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getMethod().getMethodName()+"pass");
		test.fail(result.getThrowable());
		
		String path =new WebDriverUtility().takeScreenShot(BaseClass.sdriver);
		test.addScreenCaptureFromBase64String(path);
		
		//BaseClass.sjavautility,
				//result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getMethod().getMethodName()+"skip");
		
			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
