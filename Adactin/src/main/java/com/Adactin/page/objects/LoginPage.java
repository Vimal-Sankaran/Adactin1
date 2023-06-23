package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This page class contains objects for adactin login page
 * Developed By : Janani Dass
 * Dependent Tests : LoginPageSteps.java
 */
public class LoginPage extends BaseClass {

    public WebDriver driver;
    @FindBy(xpath="//input[@name='username']")
    public WebElement userNameField;

    @FindBy(xpath="//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath="//input[@id='login']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Inputs value to username field in adactin login page
     * @param userName : Username of a user
     */
    public void setUsername(String userName) {
        sendValueToTextBox(userNameField,userName);
    }

    /**
     * Inputs value to password field in adactin login page
     * @param passWord : Password of a user
     */
    public void setPassword(String passWord) {
        sendValueToTextBox(passwordField, passWord);
    }

    /**
     * Clicks login button in adactin login page
     */
    public void clickLoginButton() {
        clickOnElement(loginButton);
    }
}
