package com.mx.undostres.models.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Recharge Page
public class LandingPage {

	public WebDriver driver;

	By phoneNo = By.xpath("//input[@type='text']");
	// operator
	By operator = By.xpath("//input[@name='operator']");
	// rechargeplan
	By rechargePlan = By.xpath(
			"//html/body/div[3]/div[2]/div[2]/div/div[1]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/div/ul[1]/li[1]/a/div[1]/b  ");

	By followingButton = By.xpath("//button[@perform='payment']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNo);
	}

	public WebElement getOperator() {
		return driver.findElement(operator);
	}

	public WebElement getTelcel() {
		return driver.findElement(By.xpath(
				"//html/body/div[3]/div[2]/div[2]/div/div[1]/form/div/div[1]/div[1]/div[2]/ul/li[2]/div/div/div/ul/li[1]/a/div/b"));
	}

	public WebElement getRechargePlan() {
		return driver.findElement(By.xpath("//html/body/div[3]/div[2]/div[2]/div/div[1]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/div/ul[1]/li[1]/a/div[1]/b"));
	}

	public WebElement submitFollowingButton() {
		return driver.findElement(followingButton);
	}
}
