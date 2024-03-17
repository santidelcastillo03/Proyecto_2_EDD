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

    public Guest(String name, String lastName, Room room, String email, String gender, String phone, String arrival) {
        this.name = name;
        this.lastName = lastName;
        this.room = room;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.arrival = arrival;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
  
    
    @Override
    public String toString() {
        return "Name: "+name +" /Last name: "+lastName+" /ROOM: "+room.getID()+" /email: "+email+ " /gender: "+gender+" /phone: "+phone+" /arrival: "+arrival;
    }
    
}
