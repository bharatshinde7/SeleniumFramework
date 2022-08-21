package com.mx.undostres.testCases.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mx.undostres.models.baseModel.base;
import com.mx.undostres.models.pageObject.LandingPage;
import com.mx.undostres.models.pageObject.LoginPage;
import com.mx.undostres.models.pageObject.PaymentPage;

public class HomePage extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void basePageNaviagation() throws IOException, InterruptedException

	{
//		driver = initializeDriver();
		driver.get("https://prueba.undostres.com.mx/");
		driver.get(prop.getProperty("url"));
		log.info("Driver initialization done");
		LandingPage recharge = new LandingPage(driver);

		recharge.getPhoneNumber().sendKeys(prop.getProperty("cellPhoneNumber"));
		recharge.getOperator().click();
		recharge.getTelcel().click();
		recharge.getRechargePlan().click();
		recharge.submitFollowingButton().click();

		log.info("Recharge processing start.....");

		PaymentPage paymentPage = new PaymentPage(driver);

		paymentPage.getPayByCardMode().click();

		paymentPage.getNewCardMode().click();
		Thread.sleep(1000);
		paymentPage.getNewCardMode().click();

		paymentPage.getCardNumber().sendKeys(prop.getProperty("cardNumber"));

		paymentPage.getCardMonthValue().sendKeys(prop.getProperty("month"));

		paymentPage.getCardYearValue().sendKeys(prop.getProperty("year"));

		paymentPage.getCardCVVValue().sendKeys(prop.getProperty("cvv"));

		paymentPage.getCardUserEmail().sendKeys(prop.getProperty("email"));

		paymentPage.getPaymentButton().click();

		log.info("Recharge processing in-progress.....");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.getUserEmailId().sendKeys(prop.getProperty("userEmail"));

		loginPage.getPassword().sendKeys(prop.getProperty("password"));
		
		Thread.sleep(10000);

		loginPage.getSubmitAction().click();

		log.info("Recharge processing is completed.....");
	}

	//@AfterTest
	public void teardown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
