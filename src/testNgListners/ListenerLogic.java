package testNgListners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogic implements ITestListener
{
	public static EdgeDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is Passed");
		Date d1=new Date();
		System.out.println(d1);
		String format1=	d1.toString();
		String month=	format1.substring(4, 7);
		String date=	format1.substring(8, 10);
		String year=	format1.substring(format1.length()-4);
		String hour=format1.substring(11, 13);
		String min=format1.substring(14, 16);
		String sec=format1.substring(17, 19);
		String format5=date.concat(" ").concat(month).concat(" ").concat(year).concat(" ").concat(hour).concat(" ").concat(min).concat(" ").concat(sec);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\ScreenshotTestNgAnnotationsBMAMusage\\passtestcase\\"+format5+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is Failed");
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\ScreenshotTestNgAnnotationsBMAMusage\\failedtestcase\\"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
