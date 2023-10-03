package TestComp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
// org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageHelper.TestDataHelp;
import PageHelper.WebDriverHelp;

public class BaseCls {
	public WebDriver driver;
	public TestDataHelp testDataHelper;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test ;
	public static Logger log = LogManager.getLogger();
	
	public static ExtentReports getReports(){
		if(extent == null) {
			extent = new ExtentReports();
			System.out.println(System.getProperty("user.dir"));
		    extent = new ExtentReports();

			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "\\ExtentReports\\");
			spark.config().setReportName("Reports of data");
			spark.config().setTheme(Theme.DARK);

			extent.attachReporter(spark);
			}
		return extent;
	}

	@Parameters("platform")
	@BeforeTest(alwaysRun = true)
	public void initializeDriver(String platform) throws Exception {
		// long threadID= Thread.currentThread().getId();
		// Log4j log4j = new Log4j();
		// Logger log = log4j.getLogger();
		WebDriverHelp webDriverHelper = new WebDriverHelp();

		if (platform.equalsIgnoreCase("local")) {
			driver = webDriverHelper.getWebDriver();

		} else {
			System.out.println("abc");
			// driver = webDriverHelper.getRemoteWebDriver();
		}
		extent = getReports();
		// CommonTestData commonTestData = new CommonTestData(driver,threadID,log);
		// ctd.set(commonTestData);

	}

	public void launchApplication() throws Exception {
		testDataHelper = new TestDataHelp();
		driver.get(testDataHelper.getValue("url"));
		Thread.sleep(2000);
	}

	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		extent.flush();
		driver.close();

	}

}
