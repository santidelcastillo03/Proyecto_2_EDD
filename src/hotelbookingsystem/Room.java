/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 *
 * @author santiagodelcastillo
 */
public class Room implements Comparable<Room> {
    private String ID;
    private String type;
    private String level;

    public Room(String ID, String type, String level) {
        this.ID = ID;
        this.type = type;
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString() {
        return "Room ID: " + getID() + ", Type: " + getType() + ", Level: " + getLevel();
    }

  @Override
    public int compareTo(Room other) {
        return this.ID.compareTo(other.ID);
    }
}
