package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Page Class contains objects for select Hotel page
 * Developed by : Janani Dass
 * Dependent Tests : SelectHotelPageSteps.java
 */
public class SelectHotelPage extends BaseClass {

    public WebDriver driver;

    public SelectHotelPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="radiobutton_0")
    public WebElement selectRadioButton;

    @FindBy(id="hotel_name_0")
    public WebElement hotelNameField;

    @FindBy(id="location_0")
    public WebElement locationField;

    @FindBy(id="rooms_0")
    public WebElement roomsField;

    @FindBy(id="arr_date_0")
    public WebElement arrivalDateField;

    @FindBy(id="dep_date_0")
    public WebElement departureDateField;

    @FindBy(id="no_days_0")
    public WebElement numberOfDaysField;

    @FindBy(id="room_type_0")
    public WebElement roomTypeField;

    @FindBy(id="price_night_0")
    public WebElement pricePerNightField;

    @FindBy(id="total_price_0")
    public WebElement totalPriceField;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(id="cancel")
    public WebElement cancelButton;

    private static String pricePerNight;
    private static String totalPrice;
    private static String numberOfDays;

    public void setPricePerNight(String pricePerNight) {
        SelectHotelPage.pricePerNight = pricePerNight;
    }

    public void setTotalPrice(String totalPrice) {
        SelectHotelPage.totalPrice = totalPrice;
    }

    public void setNumberOfDays(String numberOfDays) {
        SelectHotelPage.numberOfDays = numberOfDays;
    }

    public String getTotalPrice() { return totalPrice; }

    public String getPricePerNight() { return pricePerNight; }

    public String getNumberOfDays() { return numberOfDays; }

    /**
     * Getters for application elements
     * @return : returns application elements
     */
    public String getHotelNameField() {
        return getTextBoxValue(hotelNameField);
    }

    public String getLocationField() { return getTextBoxValue(locationField); }

    public String getRoomsField() {
        return getTextBoxValue(roomsField);
    }

    public String getArrivalDateField() {
        return getTextBoxValue(arrivalDateField);
    }

    public String getDepartureDateField() {
        return getTextBoxValue(departureDateField);
    }

    public String getNumberOfDaysField() { return getTextBoxValue(numberOfDaysField); }

    public String getRoomTypeField() {
        return getTextBoxValue(roomTypeField);
    }

    public String getPricePerNightField() { return getTextBoxValue(pricePerNightField); }

    public String getTotalPriceField() {
        return getTextBoxValue(totalPriceField);
    }


    /**
     * Selects hotel in adactin select hotel page
     */
    public void selectHotel() {
        clickOnElement(selectRadioButton);
    }

    /**
     * Clicks on continue button in adactin select hotel page
     */
    public void clickContinue() {
        clickOnElement(continueButton);
    }

    /**
     * Clicks on cancel button in adactin select hotel page
     */
    public void clickCancel() {
        clickOnElement(cancelButton);
    }

}
