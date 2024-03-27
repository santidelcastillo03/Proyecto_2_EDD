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

    /**
     *
     * @param ID
     * @param type
     * @param level
     */
    public Room(String ID, String type, String level) {
        this.ID = ID;
        this.type = type;
        this.level = level;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
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
    @Override
    public String toString() {
        return "Room ID: " + getID() + ", Type: " + getType() + ", Level: " + getLevel();
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(Room other) {
        return this.ID.compareTo(other.ID);
    }
}
