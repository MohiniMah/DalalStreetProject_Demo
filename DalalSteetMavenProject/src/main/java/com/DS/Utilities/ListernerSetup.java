package com.DS.Utilities;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import com.DS.TestBase.TestBaseClass;

	public class ListernerSetup extends TestBaseClass implements ITestListener {

		@Override
		public void onTestStart(ITestResult result) {
			logger.info("Test Case Execution Started " +result.getName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			logger.info("Test Case Execution Completed" +result.getName());
		}

		@Override
		public void onTestFailure(ITestResult result) 
		{
			logger.info("Test Case Execution Failed"+result.getName());
			UtilClass.takeSS(result.getName()+"-"+System.currentTimeMillis());
			logger.info("Take ScreenShot");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			logger.info("Test Case Execution Skipe"+result.getName());
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}

		@Override
		public void onStart(ITestContext context) {
			
		}

		@Override
		public void onFinish(ITestContext context) {
		
		
		}
	}

