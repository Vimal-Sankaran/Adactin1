package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.LoginPage;
import com.Adactin.utilities.BaseClass;
import com.Adactin.utilities.FileReaderManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * This step class contains methods for login functionality
 * Developed By : Janani Dass
 * Dependent Tests : N/A
 */
public class LoginPageSteps extends BaseClass {

    public static WebDriver driver = setChromeBrowser();
    public static FileReaderManager fileReaderManager = new FileReaderManager();
    public static LoginPage loginPage = new LoginPage(driver);
    public static EntityHelper entityHelper = new EntityHelper();

    /**
     * Navigates to adactin login page
     * @throws IOException : IO Exception
     */
    @Given("i navigate to adactin login page")
    public void navigateToAdactin() throws IOException {
        loadURL(fileReaderManager.getPropertyValue("url"));
    }

    /**
     * Inputs username and password in adactin login page
     * @param id : User id of a customer
     */
    @Given("i login with username and password for a user {string}")
    public void loginToAdactin(String id) {
        loginPage.setUsername(entityHelper.getCustomerDataById(id).getUsername());
        loginPage.setPassword(entityHelper.getCustomerDataById(id).getPassword());
        loginPage.clickLoginButton();
    }

    /**
     * Validates the successful login
     */
    @Then("i validate login is successful")
    public void validateLogin() {
        Assert.assertTrue(getCurrentURl().contains("SearchHotel"));
    }
}
