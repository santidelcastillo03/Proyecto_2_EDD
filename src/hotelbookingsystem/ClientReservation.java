/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.BSTNode;

/**
 *RESERVAS
 * @author Angel
 */
public class ClientReservation implements Comparable<ClientReservation>{
    private String ci;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String roomType;
    private String phoneNum;
    private String arrival;
    private String departure;
    private boolean checkIn;
    private boolean checkOut;
    

    public ClientReservation(String ci, String firstName, String lastName, String email, String gender, String roomType, String phoneNum, String arrival, String departure) {
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.roomType = roomType;
        this.phoneNum = phoneNum;
        this.arrival = arrival;
        this.departure = departure;
        this.checkIn = false;
        this.checkOut = false;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

@Override
public int compareTo(ClientReservation other) {
    return this.ci.compareTo(other.ci);
}
    @Override
    public String toString() {
        return "CI: " + ci + " /First Name: " + firstName + " /Last Name: " + lastName + " /Email: " + email + " /Gender: " + gender
                + " /Room Type: " + roomType + " /Phone Number: " + phoneNum + " /Arrival: " + arrival + " /Departure: " + departure;
    }
}