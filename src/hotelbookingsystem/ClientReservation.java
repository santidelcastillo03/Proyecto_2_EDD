/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 *RESERVAS
 * @author Angel
 */
public class ClientReservation{
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
    
    /**
     *
     * @param ci
     * @param firstName
     * @param lastName
     * @param email
     * @param gender
     * @param roomType
     * @param phoneNum
     * @param arrival
     * @param departure
     */
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
    }

    /**
     *
     * @return
     */
    public String getCi() {
        return ci;
    }

    /**
     *
     * @param ci
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     *
     * @param roomType
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     *
     * @return
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     *
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     *
     * @return
     */
    public String getArrival() {
        return arrival;
    }

    /**
     *
     * @param arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     *
     * @return
     */
    public String getDeparture() {
        return departure;
    }

    /**
     *
     * @param departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ci+","+firstName+","+lastName+","+email+","+gender+","+roomType+","+phoneNum+","+arrival+","+departure;
    }
    
    /**
     *
     * @return
     */
    public String display() {
    return "ID/CI: "+ci+"\nName: "+firstName+"\nLast Name: "+lastName
        +"\nEmail: "+email+"\nGender: "+gender+"\nRoom Type: "+roomType
        +"\nPhone Number: "+phoneNum+"\nArrival: "+arrival+"\nDeparture: "+departure;
    }
}