package com.Adactin.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerData {

    @JsonProperty("id")
    private String id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @JsonProperty("location")
    private String location;

    @JsonProperty("hotels")
    private String hotels;
    @JsonProperty("roomType")
    private String roomType;

    @JsonProperty("numberOfRooms")
    private String numberOfRooms;

    @JsonProperty("checkInDate")
    private String checkInDate;

    @JsonProperty("checkOutDate")
    private String checkOutDate;

    @JsonProperty("adultsPerRoom")
    private String adultsPerRoom;

    @JsonProperty("childrenPerRoom")
    private String childrenPerRoom;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHotels() {
        return hotels;
    }

    public void setHotels(String hotels) {
        this.hotels = hotels;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getAdultsPerRoom() {
        return adultsPerRoom;
    }

    public void setAdultsPerRoom(String adultsPerRoom) {
        this.adultsPerRoom = adultsPerRoom;
    }

    public String getChildrenPerRoom() {
        return childrenPerRoom;
    }

    public void setChildrenPerRoom(String childrenPerRoom) {
        this.childrenPerRoom = childrenPerRoom;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
