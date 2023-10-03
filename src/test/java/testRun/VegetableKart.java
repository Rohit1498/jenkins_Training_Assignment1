package testRun;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectData.VegetableKartData;
import TestComp.BaseCls;

public class VegetableKart extends BaseCls {
	


	@Test(priority = 1)
	public void vegitableSearch() throws Exception {
		VegetableKartData veg = new VegetableKartData(driver);
		launchApplication();
		log.info("Launching  Webdriver and URL");
		veg.searchVegi();
		log.debug("searching product on seacrh field");
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();

		String expectedTitle = "GreenKart - veg and fruits kart";

		Assert.assertEquals(actualTitle, expectedTitle);
		log.debug("Checking Website title using assertion");
		System.out.println("search vegetable success");
		test = extent.createTest("search vegetable");
	}

	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void incrementBtnCheck() throws InterruptedException {
		System.out.println("increment button");
		VegetableKartData veg = new VegetableKartData(driver);
		veg.clickOnIncrement_Btn();
		
		veg.clickOnIncrement_Btn();
		
		veg.clickOnIncrement_Btn();
			
		test = extent.createTest("add item");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test(priority = 3)
	public void addToKart() throws Exception {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.addToCart();
		Thread.sleep(3000);
		log.info("just clicking on AddToCartButton");
		System.out.println("item addtocart successfully");
		test = extent.createTest("addToCart");
	}
	@Test(priority = 4)
	public void GoToCartCheck() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.CartLogoClick();
		Thread.sleep(3000);
		log.info("Clicking on GoTo cart button logo");
		System.out.println("go to kart");
		test = extent.createTest("Go to Cart");
	}
	@Test (priority = 5)
	public void CheckOutCheck() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.ProceedCheckBtn();
		Thread.sleep(3000);
		log.debug("Sending promocode to promo field");
		System.out.println("proceed btn");
		test = extent.createTest("Proceed");

	}
	@Test (priority = 6)
	public void PromoFieldCheck() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.PromocodeFill();
		Thread.sleep(3000);
		System.out.println("promocode fill success");
		test = extent.createTest("promocode");

	}

	@Test (priority = 7)
	public void promocodeCheck() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.ApplyPromo();
		Thread.sleep(3000);
		log.info("Clicking on Apply promo code button");
		System.out.println("Apply Promo code");
		test = extent.createTest("Apply PromoCode");
	}

	@Test (priority = 8)
	public void PlaceorderCheck() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.PlaceOrderbtClick();
		Thread.sleep(3000);
		log.info("Clicking on place order");
		System.out.println("order place");
		test = extent.createTest("Place Order");
	}

	@Test (priority = 9)
	public void SelectCountryDropDown() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.selectCountry();
		Thread.sleep(3000);
		//log.debug("Selecting country from Country dropdown");
		System.out.println("country selection");
		test = extent.createTest("Select Country");
	}

	@Test (priority = 10)
	public void ClickCheckBtn() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.AgreeChkBtn();;
		Thread.sleep(3000);
		log.info("clicking on check button for agree terms/conditions");
		System.out.println("Agree Terms");
		test = extent.createTest("Terms Agree");
	}



	@Test (priority = 11)
	public void FinalProceedBtn() throws InterruptedException {
		VegetableKartData veg = new VegetableKartData(driver);
		veg.ProceedBtn();;
		Thread.sleep(5000);
		//log.debug("clicking on Final proceed button");
		System.out.println("order placed ");
		test = extent.createTest("Order Placed");
	}


}
