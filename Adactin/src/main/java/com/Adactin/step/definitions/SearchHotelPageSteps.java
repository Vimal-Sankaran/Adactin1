package com.Adactin.step.definitions;
import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SearchHotelPage;
import com.Adactin.utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

/**
 * This Step class contains methods for Search Hotel functionality
 * Developed by : Jaya
 * Dependent Test : N/A
 */
public class SearchHotelPageSteps extends BaseClass {

    public WebDriver driver=setChromeBrowser();
    SearchHotelPage searchHotelPage =new SearchHotelPage(driver);
    EntityHelper entityHelper =new EntityHelper();

    public SearchHotelPageSteps() throws IOException {
    }

    /**
     * Selects Location from Dropdown
     * @param location : Location of a Hotel
     */
    @Given ("i enter location {string} in Adactin Search Hotel Page")
    public void selectLocation(String location) {
        searchHotelPage.setLocation(location);
    }

    /**
     * Selects Hotels from Dropdown
     * @param hotels : Hotel Name
     */
    @Given ("i enter hotels {string} in Adactin Search Hotel Page")
    public void selectHotels(String hotels) {
        searchHotelPage.setHotels(hotels);
    }

    /**
     * Selects Room Type from Dropdown
     * @param roomType : Room Type
     */
    @Given ("i enter roomType {string} in Adactin Search Hotel Page")
    public void selectRoomType(String roomType) {
        searchHotelPage.setRoomType(roomType);
    }

    /**
     * Selects Number of rooms from Dropdown
     * @param numberOfRooms : Number of Rooms
     */
    @Given ("i enter numberOfRooms {string} in Adactin Search Hotel Page")
    public void selectNumberOfRooms(String numberOfRooms) {
        searchHotelPage.setNumberOfRooms(numberOfRooms);
    }

    /**
     * Inputs Check In Date in Search Hotel Page
     * @param checkInDate : Check In Date
     */
    @Given ("i enter checkInDate {string} in Adactin Search Hotel Page")
    public void selectCheckInDate(String checkInDate) {
        searchHotelPage.setCheckInDate(checkInDate);
    }

    /**
     * Inputs Check Out Date in Search Hotel Page
     * @param checkOutDate :Check Out Date
     */
    @Given ("i enter checkOutDate {string} in Adactin Search Hotel Page")
    public void selectCheckOutDate(String checkOutDate) {
        searchHotelPage.setCheckOutDate(checkOutDate);
    }

    /**
     * Selects Adults Count from dropdown
     * @param adultsCount : Adults Count
     */
    @Given ("i enter adultsPerRoom {string} in Adactin Search Hotel Page")
    public void selectAdultsPerRoom(String adultsCount) {
        searchHotelPage.setAdultsPerRoom(adultsCount);
    }

    /**
     * Selects Children Count from Dropdown
     * @param childrenCount : Children Count
     */
    @Given ("i enter childrenPerRoom {string} in Adactin Search Hotel Page")
    public void selectChildrenPerRoom(String childrenCount) {
        searchHotelPage.setChildrenPerRoom(childrenCount);
    }

    /**
     * Inputs Booking Details for a Customer
     * @param id : User Id of a Customer
     */
    @Given("i enter booking details for {string}")
        public void enterSearchHotelPageDetails(String id) {
        searchHotelPage.setLocation(entityHelper.getCustomerDataById(id).getLocation());
        searchHotelPage.setHotels(entityHelper.getCustomerDataById(id).getHotels());
        searchHotelPage.setRoomType(entityHelper.getCustomerDataById(id).getRoomType());
        searchHotelPage.setNumberOfRooms(entityHelper.getCustomerDataById(id).getNumberOfRooms());
        searchHotelPage.setCheckInDate(entityHelper.getCustomerDataById(id).getCheckInDate());
        searchHotelPage.setCheckOutDate(entityHelper.getCustomerDataById(id).getCheckOutDate());
        searchHotelPage.setAdultsPerRoom(entityHelper.getCustomerDataById(id).getAdultsPerRoom());
        searchHotelPage.setChildrenPerRoom(entityHelper.getCustomerDataById(id).getChildrenPerRoom());
    }

    /**
     * Clicks on Search Button in Search Hotel Page
     */
    @Given("i click on search button in SearchHotel Page")
    public void clickSearchButton() {
        searchHotelPage.clickSearch();
    }

    /**
     * Validates the landing of Select Hotel page
     */
    @Then("i validate navigation to Select Hotel page")
    public void validateSearch() {
        Assert.assertTrue(getCurrentURl().contains("SelectHotel"));
    }

}


