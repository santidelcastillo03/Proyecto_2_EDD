/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 *
 * @author Santiago
 */
public class ClientRoomSearch {
    private String name;
    private String lastName;
    private Room room;

    public ClientRoomSearch(String name, String lastName, Room room) {
        this.name = name;
        this.lastName = lastName;
        this.room = room;
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
        return "ClientSearch{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", room=" + room .toString()+
                '}';
    }
    
}
