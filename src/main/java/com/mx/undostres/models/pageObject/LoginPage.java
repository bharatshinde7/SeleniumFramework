package com.mx.undostres.models.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userEmailId = By.xpath("//input[@id='usrname']");
	By password = By.xpath("//input[@id='psw']");
	By loginButton = By.xpath("//button[@id='loginBtn']");
	
	public WebElement getUserEmailId() {
		return driver.findElement(userEmailId);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmitAction() {
		return driver.findElement(loginButton);
	}
}
