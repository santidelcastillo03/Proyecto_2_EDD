/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.BST;
import DataStructures.BSTNode;
import DataStructures.DynamicArray;
import DataStructures.HashTable;

/**
 *
 * @author santiagodelcastillo
 */
public class Hotel {
    private HashTable<String, Guest> currentGuests;
    private CSVReaderGuestsRooms csvReaderGuestsRooms;
    private CSVReaderReservationHistory csvReaderReservationHistory;
    private BST reservations;
    private BST roomHistory;
    

    public Hotel(int size, String csvPath) {
        this.currentGuests = new HashTable<>(size);
        this.csvReaderGuestsRooms = new CSVReaderGuestsRooms(csvPath);
        this.currentGuests = csvReaderGuestsRooms.readGuests();
        this.csvReaderReservationHistory = new CSVReaderReservationHistory(csvPath);
        this.reservations = csvReaderReservationHistory.readReservations();
        this.roomHistory = csvReaderReservationHistory.readHistory();
    }
   

    public void uploadClient(Guest client) {
        String key = client.getName() + " " + client.getLastName();
        currentGuests.put(key, client);
    }

    public String checkGuest(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        Guest client = currentGuests.get(key);
        return client != null ? client.getRoom().getID() : null;
    }
    
    public ClientReservation searchReservationByCi(int ci) {    
        BSTNode current = reservations.getRoot();
        while (current != null) {
            if (ci == current.getId()) {
                return (ClientReservation) current.getData();
            } else if (ci < current.getId()) {
                current = current.getLeftSon();
            } else {
                current = current.getRightSon();
                }
    }
    return null; // Return null if the reservation with the given ID is not found
} // @author Angel 
    
    public DynamicArray<RoomHistory> searchHistoryByRoom(int roomNumber) {    
        BSTNode current = reservations.getRoot();
        while (current != null) {
            if (roomNumber == current.getId()) {
                return (DynamicArray) current.getData();
            } else if (roomNumber < current.getId()) {
                current = current.getLeftSon();
            } else {
                current = current.getRightSon();
                }
    }
    return null; // Return null if the reservation with the given ID is not found
} // @author Angel 
    
    
    
    
    
    //public String freeRoom(String roomType){
        //for(reservation :  )}
        
            
        }

