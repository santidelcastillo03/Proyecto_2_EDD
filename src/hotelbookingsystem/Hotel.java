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
    private HashTable<String, Guest> currentGuestsName;
    private HashTable<String, Guest> currentGuestsRoom;
    private CSVReaderGuestsRooms csvReaderGuestsRooms;
    private READERconAVL csvReaderconAVL;
    private AVLTree<ClientReservation> reservations;
    private AVLTree<DynamicArray<RoomHistory>> roomHistory;
    

    public Hotel() {
        this.currentGuestsName = new HashTable<>(100);
        this.currentGuestsRoom = new HashTable<>(100);
        this.csvReaderGuestsRooms = new CSVReaderGuestsRooms();
        this.currentGuestsName = csvReaderGuestsRooms.readGuestsCI();
        this.currentGuestsRoom = csvReaderGuestsRooms.readGuestsRoom();
        this.csvReaderconAVL = new READERconAVL();
        this.reservations = csvReaderconAVL.readReservasCSV();
        this.roomHistory = csvReaderconAVL.readHistoricoCSV();
    }
   

    public void uploadClient(Guest client) {
        String key = client.getName() + " " + client.getLastName();
        currentGuestsName.put(key, client);
    }

    public String checkGuest(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        Guest client = currentGuestsName.get(key);
        return client != null ? client.getRoom().getID() : null;
    }
    
    public AVLNode searchReservationByCi(int ci) {    
        AVLNode current = reservations.getRoot();
        while (current != null) {
            int a = current.getKey();
            if (ci == a) {
                return current;
            } else if (ci < a) {
                current = current.getLeft();
            } else {
                current = current.getRight();
                }
    }
    return null;
}
    
    public AVLNode searchHistoryByRoom(int roomNumber) {    
        AVLNode current = roomHistory.getRoot();
        while (current != null) {
            int a = current.getKey();
            if (roomNumber == a) {
                return current;
            } else if (roomNumber < a) {
                current = current.getLeft();
            } else {
                current = current.getRight();
                }
    }
    return null;
}
    
    public void checkIn(int ci){
        ClientReservation reservation = (ClientReservation) searchReservationByCi(ci).getData();
        String roomReservedType = reservation.getRoomType();
        HashTable<String, Guest> roomsOccupied = currentGuestsRoom; 
        HashTable<String, Room> freeRooms = csvReaderGuestsRooms.readRooms(); 
        for (String room : freeRooms.keys()){
            Guest occupiedRoomGuest = roomsOccupied.get(room);//CHANGE
            if(occupiedRoomGuest != null && occupiedRoomGuest.equals(true)){
                freeRooms.removeNode(room);
            }         
        }
        for (String room : freeRooms.keys()){
            Room possibleRoom = freeRooms.get(room);
            if (possibleRoom.getType().equals(roomReservedType)){
                Guest newGuest = new Guest(reservation.getFirstName(), reservation.getLastName(), possibleRoom, reservation.getEmail(), reservation.getGender(), reservation.getPhoneNum(), reservation.getArrival());
                String rkey = reservation.getFirstName() + " " + reservation.getLastName();
                currentGuestsName.put(rkey, newGuest);
                currentGuestsRoom.put(possibleRoom.getID(), newGuest);
                reservations.delete(ci, reservation);
            }
            
        }
        CSVWriter writer = new CSVWriter();
        writer.updateEstado(currentGuestsName);
        writer.updateReservas(reservations, reservation.getFirstName() + "," + reservation.getLastName());

        
    }
    
    public void checkOut(int roomNum, int ci){
        Guest guest = currentGuestsRoom.get(Integer.toString(roomNum));
        String newci = Integer.toString(ci);
        newci = newci.replace(".", "");
        StringBuilder id = new StringBuilder();
        int counter = 0;
        for (int i = newci.length() - 1; i >= 0; i--) {
            if (counter == 3) {
                id.insert(0, '.');
                counter = 0;
            }
            if (i < newci.length()) {
                id.insert(0, newci.charAt(i));
            }
            counter++;


        }
        RoomHistory prevGuest = new RoomHistory(id.toString(), guest.getName(), guest.getLastName(), guest.getEmail(), guest.getGender(), guest.getArrival(), roomNum);
        AVLNode nodeExistsAlready = roomHistory.search(roomNum);
                if(nodeExistsAlready != null){
                    DynamicArray<RoomHistory> a = (DynamicArray) nodeExistsAlready.getData();
                    a.add(prevGuest);
                } else{
                    DynamicArray<RoomHistory> prevGuests = new DynamicArray();
                    prevGuests.add(prevGuest);
                    roomHistory.addLeaf(roomNum, prevGuests);
                }
                String fullName = guest.getName() +" "+ guest.getLastName();
                currentGuestsName.removeNode(fullName);
                currentGuestsRoom.removeNode(Integer.toString(roomNum));
                CSVWriter writer = new CSVWriter();
                writer.updateEstado(currentGuestsName);
                writer.updateHistorico(roomHistory);
            }
        
    }
    
    
    
        
            

