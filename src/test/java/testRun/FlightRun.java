package testRun;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectData.FlightData;
import TestComp.BaseCls;

public class FlightRun extends BaseCls {

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void FlightSearch() throws Exception {
		FlightData fc = new FlightData(driver);
		launchApplication();
		fc.flightOpen();
		
		System.out.println("Flight Booking");
		String expectedtitle = "QAClickJet - Flight Booking ";
		String actualtitle = driver.getTitle();
		
		Assert.assertNotEquals(actualtitle, expectedtitle);

		test = extent.createTest("FlightSearch");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void FlightRadio() throws Exception {
		FlightData fc = new FlightData(driver);
		Thread.sleep(3000);
		// launchApplication();
		fc.radioBtn();
		Thread.sleep(3000);
		System.out.println("aaaaaaaaaaaaaaa");
	}
}
