package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This Page Class contains objects for search Hotel page
 * Developed by : Jaya
 * Dependent Tests : SearchHotelPageSteps.java
 */
public class SearchHotelPage extends BaseClass {

    public WebDriver driver;

    public SearchHotelPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="location")
    public WebElement locationDropdown;

    @FindBy(id="hotels")
    public WebElement hotelsDropdown;

    @FindBy(id="room_type")
    public WebElement roomTypeDropdown;

    @FindBy(id="room_nos")
    public WebElement numberOfRoomsDropdown;

    @FindBy(id="datepick_in")
    public WebElement checkInDate;

    @FindBy(id="datepick_out")
    public WebElement checkOutDate;

    @FindBy(id="adult_room")
    public WebElement adultsPerRoomDropdown;

    @FindBy(id="child_room")
    public WebElement childrenPerRoomDropdown;

    @FindBy(id="Submit")
    public WebElement searchButton;

    @FindBy(id="Reset")
    public WebElement resetButton;

    /**
     * Selects Location from dropdown in Adactin Search Hotel Page
     * @param location : Location of a Hotel
     */
    public void setLocation( String location) {
        selectDropDownByText(locationDropdown,location);
    }

    /**
     * Selects Hotels from dropdown in Adactin Search Hotel Page
     * @param hotels : Hotel Name
     */
    public void setHotels(String hotels) {
        selectDropDownByText(hotelsDropdown,hotels);
    }

    /**
     * Selects Room Type from dropdown in Adactin Search Hotel Page
     * @param roomType : Room Type
     */
    public void setRoomType(String roomType) {
        selectDropDownByText(roomTypeDropdown,roomType);
    }

    /**
     * Selects Number of Rooms from dropdown in Adactin Search Hotel Page
     * @param numberOfRooms : Number of Rooms
     */
    public void setNumberOfRooms(String numberOfRooms) {
        selectDropDownByText(numberOfRoomsDropdown,numberOfRooms);
    }

    /**
     * Inputs Check In Date in Adactin Search Hotel Page
     * @param date : Check-In-Date
     */
    public void setCheckInDate(String date) {
        sendValueToTextBox(checkInDate,date);
    }

    /**
     * Inputs Check Out Date in Adactin Search Hotel Page
     * @param date : Check-Out-Date
     */
    public void setCheckOutDate(String date) {
        sendValueToTextBox(checkOutDate,date);
    }

    /**
     * Selects Adults Per Room from dropdown in Adactin Search Hotel Page
     * @param adultsPerRoom : Adults Per Room
     */
    public void setAdultsPerRoom(String adultsPerRoom) {
        selectDropDownByText(adultsPerRoomDropdown,adultsPerRoom);
    }

    /**
     * Selects Children Per Room from dropdown in Adactin Search Hotel Page
     * @param childrenPerRoom : Children Per Room
     */
    public void setChildrenPerRoom(String childrenPerRoom) {
        selectDropDownByText(childrenPerRoomDropdown,childrenPerRoom);
    }

    /**
     * Clicks Search Button in Adactin Search Hotel Page
     */
    public void clickSearch() {
        clickOnElement(searchButton);
    }
    /**
     * Clicks Reset Button in Adactin Search Hotel Page
     */
    public void clickResetButton() {
        clickOnElement(resetButton);
    }


}