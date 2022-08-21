package com.mx.undostres.models.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	public WebDriver driver;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}

	By payByCardMode = By.xpath("(//p[@class='panelTextStyleDesktop'])[2]");
	
	By newCardMode = By.xpath("//*[@id=\"radio-n\"]/td/label/a"); //By.xpath("(//label[@class='radio-custom-label'])[1]");
		
	By cardNumber = By.xpath("//input[@id='cardnumberunique']");
	By cardMonthValue = By.xpath("(//input[@name='expmonth'])[2]");
	By cardYearValue = By.xpath("(//input[@name='expyear'])[2]");
	By cardCVVValue = By.xpath("(//input[@type='password'])[16]");
	By cardUserEmail = By.xpath("(//input[@type='email'])[1]");
	By paymentButton = By.xpath("//*[@id=\"paylimit\"]/span");

	public WebElement getPayByCardMode() {
		return driver.findElement(payByCardMode);
	}

	public WebElement getNewCardMode() {
		return driver.findElement(By.xpath("//*[@id=\"radio-n\"]/td/label/a"));
	}

	public WebElement getCardNumber() {
		return driver.findElement(cardNumber);
	}

	public WebElement getCardMonthValue() {
		return driver.findElement(cardMonthValue);
	}

	public WebElement getCardYearValue() {
		return driver.findElement(cardYearValue);
	}

	public WebElement getCardCVVValue() {
		return driver.findElement(cardCVVValue);
	}

	public WebElement getCardUserEmail() {
		return driver.findElement(cardUserEmail);
	}

	public WebElement getPaymentButton() {
		return driver.findElement(paymentButton);
	}
}
