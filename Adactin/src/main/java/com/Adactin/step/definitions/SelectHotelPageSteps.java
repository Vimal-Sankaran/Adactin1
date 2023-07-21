package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SelectHotelPage;
import com.Adactin.utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * This step class contains methods for select hotel functionality
 * Developed By : Janani Dass
 * Dependent Tests : N/A
 */
public class SelectHotelPageSteps extends BaseClass {

    SelectHotelPage selectHotelPage = new SelectHotelPage(driver);
    EntityHelper entityHelper = new EntityHelper();

    public SelectHotelPageSteps() {}

    /**
     * Selects hotel in select hotel page
     */
    @Given("i select hotel in adactin select hotel page")
    public void selectHotel() {
        selectHotelPage.selectHotel();
    }

    /**
     * Validates hotel details are displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate hotel details are displayed for {string}")
    public void validateHotelDetails(String id) {
        assertTrue(selectHotelPage.getHotelNameField(), entityHelper.getCustomerDataById(id).getHotel(), "Hotel Matched");
        assertTrue(selectHotelPage.getLocationField(), entityHelper.getCustomerDataById(id).getLocation(), "Location Matched");
        assertTrue(selectHotelPage.getRoomsField().substring(0,0), entityHelper.getCustomerDataById(id).getNumberOfRooms().substring(0,0), "Room count Matched");
        assertTrue(selectHotelPage.getArrivalDateField(), entityHelper.getCustomerDataById(id).getCheckInDate(), "Arrival date Matched");
        assertTrue(selectHotelPage.getDepartureDateField(), entityHelper.getCustomerDataById(id).getCheckOutDate(), "Departure date Matched");
        assertTrue(selectHotelPage.getRoomTypeField(), entityHelper.getCustomerDataById(id).getRoomType(), "Room type Matched");
        selectHotelPage.setPricePerNight(selectHotelPage.getPricePerNightField());
        selectHotelPage.setTotalPrice(selectHotelPage.getTotalPriceField());
        selectHotelPage.setNumberOfDays(selectHotelPage.getNumberOfDaysField());
    }

    /**
     * Validates hotel name is displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate hotel name is displayed for {string} in select hotel page")
    public void validateHotelName(String id) {
        assertTrue(selectHotelPage.getHotelNameField(), entityHelper.getCustomerDataById(id).getHotel(), "Hotel name Matched");
    }

    /**
     * Validates location is displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate location is displayed for {string} in select hotel page")
    public void validateLocation(String id) {
        assertTrue(selectHotelPage.getLocationField(), entityHelper.getCustomerDataById(id).getLocation(), "Location Matched");
    }

    /**
     * Validates rooms count for a customer
     * @param id : User id of a customer
     */
    @Given("i validate rooms count is displayed for {string} in select hotel page")
    public void validateRoomsCount(String id) {
        assertTrue(selectHotelPage.getRoomsField().substring(0,0), entityHelper.getCustomerDataById(id).getNumberOfRooms().substring(0,0), "Number of rooms count Matched");
    }

    /**
     * Validates arrival date is displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate arrival date is displayed for {string} in select hotel page")
    public void validateArrivalDate(String id) {
        assertTrue(selectHotelPage.getArrivalDateField(), entityHelper.getCustomerDataById(id).getCheckInDate(), "Arrival date Matched");
    }

    /**
     * Validates departure date is displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate departure date is displayed for {string} in select hotel page")
    public void validateDepartureDate(String id) {
        assertTrue(selectHotelPage.getDepartureDateField(), entityHelper.getCustomerDataById(id).getCheckOutDate(), "Departure date Matched");
    }

    /**
     * Validated room type is displayed for a customer
     * @param id : User id of a customer
     */
    @Given("i validate room type is displayed for {string} in select hotel page")
    public void validateRoomType(String id) {
        assertTrue(selectHotelPage.getRoomTypeField(), entityHelper.getCustomerDataById(id).getRoomType(), "Room type Matched");
    }

    /**
     * Clicks on continue button in select hotel page
     */
    @Given("i click on continue button in select hotel page")
    public void clickContinueButton() {
        selectHotelPage.clickContinue();
    }

    /**
     * Validates the landing of book hotel page
     */
    @Then("i validate navigation to book hotel page")
    public void validateBookHotelNavigation() {
        Assert.assertTrue(getCurrentURl().contains("BookHotel"));
    }
}
