/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 * ESTADO
 * @author Santiago
 */
public class Guest {
    private String name;
    private String lastName;
    private Room room;
    private String email;
    private String gender;
    private String phone;
    private String arrival;

    /**
     *
     * @param name
     * @param lastName
     * @param room
     * @param email
     * @param gender
     * @param phone
     * @param arrival
     */
    public Guest(String name, String lastName, Room room, String email, String gender, String phone, String arrival) {
        this.name = name;
        this.lastName = lastName;
        this.room = room;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.arrival = arrival;
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
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Room getRoom() {
        return room;
    }

    /**
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return room.getID() + "," + name + "," + lastName + "," + email + "," + gender + "," + phone + "," + arrival;
    }
    
}
