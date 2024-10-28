
package com.GenericLibrary;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Implementation_Utility implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		try {
			TakeScreen_Shot_Utility.ScreenShotFailure();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}