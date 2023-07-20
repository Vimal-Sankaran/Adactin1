package com.Adactin.step.definitions;
import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SearchHotelPage;
import com.Adactin.utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * This Step class contains methods for search hotel functionality
 * Developed by : Jaya
 * Dependent Test : N/A
 */
public class SearchHotelPageSteps extends BaseClass {

    SearchHotelPage searchHotelPage = new SearchHotelPage(driver);
    EntityHelper entityHelper = new EntityHelper();

    public SearchHotelPageSteps() {}

    /**
     * Selects location from dropdown
     * @param location : Location of a hotel
     */
    @Given ("i select location {string} in adactin search hotel page")
    public void selectLocation(String location) {
        searchHotelPage.setLocation(location);
    }

    /**
     * Selects hotel from Dropdown
     * @param hotels : Hotel name
     */
    @Given ("i select hotel {string} in adactin search hotel page")
    public void selectHotel(String hotels) {
        searchHotelPage.setHotel(hotels);
    }

    /**
     * Selects room type from dropdown
     * @param roomType : Room type
     */
    @Given ("i select room type {string} in adactin search hotel page")
    public void selectRoomType(String roomType) {
        searchHotelPage.setRoomType(roomType);
    }

    /**
     * Selects number of rooms from dropdown
     * @param numberOfRooms : Number of rooms
     */
    @Given ("i select number of rooms {string} in adactin search hotel page")
    public void selectNumberOfRooms(String numberOfRooms) {
        searchHotelPage.setNumberOfRooms(numberOfRooms);
    }

    /**
     * Inputs check in date in search hotel page
     * @param checkInDate : Check in date
     */
    @Given ("i enter check in date {string} in adactin search hotel page")
    public void selectCheckInDate(String checkInDate) {
        searchHotelPage.setCheckInDate(checkInDate);
    }

    /**
     * Inputs check out date in search hotel page
     * @param checkOutDate :Check out date
     */
    @Given ("i enter check out date {string} in adactin search hotel page")
    public void selectCheckOutDate(String checkOutDate) {
        searchHotelPage.setCheckOutDate(checkOutDate);
    }

    /**
     * Selects adults count from dropdown
     * @param adultsCount : Adults count
     */
    @Given ("i select adults per room {string} in adactin search hotel page")
    public void selectAdultsPerRoom(String adultsCount) {
        searchHotelPage.setAdultsPerRoom(adultsCount);
    }

    /**
     * Selects children count from dropdown
     * @param childrenCount : Children count
     */
    @Given ("i select children per room {string} in adactin search hotel page")
    public void selectChildrenPerRoom(String childrenCount) {
        searchHotelPage.setChildrenPerRoom(childrenCount);
    }

    /**
     * Inputs booking details for a customer
     * @param id : User id of a customer
     */
    @Given("i enter booking details for {string}")
        public void enterSearchHotelPageDetails(String id) {
        searchHotelPage.setLocation(entityHelper.getCustomerDataById(id).getLocation());
        searchHotelPage.setHotel(entityHelper.getCustomerDataById(id).getHotel());
        searchHotelPage.setRoomType(entityHelper.getCustomerDataById(id).getRoomType());
        searchHotelPage.setNumberOfRooms(entityHelper.getCustomerDataById(id).getNumberOfRooms());
        searchHotelPage.setCheckInDate(entityHelper.getCustomerDataById(id).getCheckInDate());
        searchHotelPage.setCheckOutDate(entityHelper.getCustomerDataById(id).getCheckOutDate());
        searchHotelPage.setAdultsPerRoom(entityHelper.getCustomerDataById(id).getAdultsPerRoom());
        searchHotelPage.setChildrenPerRoom(entityHelper.getCustomerDataById(id).getChildrenPerRoom());
    }

    /**
     * Clicks on search button in search hotel page
     */
    @Given("i click on search button in search hotel page")
    public void clickSearchButton() {
        searchHotelPage.clickSearch();
    }

    /**
     * Validates the landing of select hotel page
     */
    @Then("i validate navigation to select hotel page")
    public void validateSearch() {
        Assert.assertTrue(getCurrentURl().contains("SelectHotel"));
    }

}


