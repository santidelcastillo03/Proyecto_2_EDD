/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLNode;
import DataStructures.AVLTree;
import DataStructures.DynamicArray;
import DataStructures.HashTable;

/**
 *
 * @author santiagodelcastillo
 */
public class Hotel {
    private HashTable<String, Guest> currentGuests;
    private CSVReaderGuestsRooms csvReaderGuestsRooms;
    private READERconAVL csvReaderconAVL;
    private AVLTree<ClientReservation> reservations;
    private AVLTree<RoomHistory> roomHistory;
    

    public Hotel() {
        this.currentGuests = new HashTable<>(100);
        this.csvReaderGuestsRooms = new CSVReaderGuestsRooms("src/CSVFiles/Booking_hotel - estado.csv");
        this.currentGuests = csvReaderGuestsRooms.readGuests();
        this.csvReaderconAVL = new READERconAVL();
        this.reservations = csvReaderconAVL.readReservasCSV("src/CSVFiles/Booking_hotel - reservas.csv");
        this.roomHistory = csvReaderconAVL.readHistoricoCSV("src/CSVFiles/Booking_hotel - Histórico.csv");
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
    
//    public ClientReservation searchReservationByCi(int ci) {
//        AVLNode current = reservations.getRoot();
//        while (current != null) {
//            int a = current.getKey();
//            if (ci == a) {
//                return (ClientReservation) current.getData();
//            } else if (ci < a) {
//                current = current.getLeft();
//            } else {
//                current = current.getRight();
//                }
//    }
//    return null;
//}
    
//    public DynamicArray<RoomHistory> searchHistoryByRoom(int roomNumber) {
//        AVLNode current = roomHistory.getRoot();
//        while (current != null) {
//            int a = current.getKey();
//            if (roomNumber == a) {
//                return (DynamicArray) current.getData();
//            } else if (roomNumber < a) {
//                current = current.getLeft();
//            } else {
//                current = current.getRight();
//                }
//    }
//    return null;
//}
    
    
    
    
    
    //public String freeRoom(String roomType){
        
    //}
        
            
        }

