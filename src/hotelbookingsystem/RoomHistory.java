/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 * HISTORICO
 * @author Santiago
 */
public class RoomHistory implements Comparable<RoomHistory> {
    String ID;
    String name;
    String lastName;
    String email;
    String gender;
    String arrival;
    int room;

    /**
     *
     * @param ID
     * @param name
     * @param lastName
     * @param email
     * @param gender
     * @param arrival
     * @param room
     */
    public RoomHistory(String ID, String name, String lastName, String email, String gender, String arrival, int room) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.arrival = arrival;
        this.room = room;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
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
    public int getRoom() {
        return room;
    }

    /**
     *
     * @param room
     */
    public void setRoom(int room) {
        this.room = room;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ID+","+name+","+lastName+","+email+","+gender+","+arrival+","+room;
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(RoomHistory other) {
        return this.ID.compareTo(other.ID);
    }
    }

