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
 *This class contains the main methods of the project
 * @author Santiago del Castillo
 */
public class Hotel {
    private HashTable<String, Guest> currentGuestsName;
    private HashTable<String, Guest> currentGuestsRoom;
    private CSVReaderGuestsRooms csvReaderGuestsRooms;
    private READERconAVL csvReaderconAVL;
    private AVLTree<ClientReservation> reservations;
    private AVLTree<DynamicArray<RoomHistory>> roomHistory;
    private static Hotel instance;

    /**
     *
     */
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
    
    /**
     * create one instance of the class that can be used throughout the project
     *@author Santiago del Castillo
     * @return
     */
    public static synchronized Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    /**
     * add a guest to the hash table
     *@author Santiago del Castillo
     * @param client
     */
    public void uploadClient(Guest client) {
        String key = client.getName() + " " + client.getLastName();
        currentGuestsName.put(key, client);
    }

    /**
     *@author Santiago del Castillo
     * @param firstName
     * @param lastName
     * @return
     */
    public String checkGuest(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        Guest client = currentGuestsName.get(key);
        return client != null ? client.getRoom().getID() : null;
    }

    /**
     * searches in the reservation AVL by ci
     *@author Vicente Tralci
     * @param ci
     * @return
     */
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

    /**
     * searches the history AVL by room number
     *@author Vicente Tralci
     * @param roomNumber
     * @return
     */
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

    /**
     * does the checkin
     *@author Vicente Tralci
     * @param ci
     */
    public void checkIn(int ci){
        ClientReservation reservation = (ClientReservation) searchReservationByCi(ci).getData();
        String roomReservedType = reservation.getRoomType();
        HashTable<String, Guest> roomsOccupied = currentGuestsRoom;
        HashTable<String, Room> freeRooms = csvReaderGuestsRooms.readRooms();
        for (String room : freeRooms.keys()){
            Guest occupiedRoomGuest = roomsOccupied.get(room);
            if(occupiedRoomGuest != null){
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
                break;
            }
        }
        CSVWriter writer = new CSVWriter();
        writer.updateEstado(currentGuestsName);
        writer.updateReservas(reservations, reservation.getFirstName() + "," + reservation.getLastName());


    }

    /**
     * does the checkout
     *@author Vicente Tralci
     * @param fullName
     * @param roomNum
     * @param ci
     * @throws Exception
     */
    public void checkOut(String fullName, int roomNum, int ci) throws Exception {
        Guest guest = currentGuestsName.get(fullName);
        if (guest == null) {
            throw new Exception("Guest not found.");
        }
        if (!guest.getRoom().getID().equals(Integer.toString(roomNum))) {
            throw new Exception("Room number does not match.");
        }
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
        if (guest != null) {
            RoomHistory prevGuest = new RoomHistory(id.toString(), guest.getName(), guest.getLastName(), guest.getEmail(), guest.getGender(), guest.getArrival(), roomNum);
            AVLNode nodeExistsAlready = roomHistory.search(roomNum);
            if (nodeExistsAlready != null) {
                DynamicArray<RoomHistory> a = (DynamicArray) nodeExistsAlready.getData();
                a.add(prevGuest);
            } else {
                DynamicArray<RoomHistory> prevGuests = new DynamicArray();
                prevGuests.add(prevGuest);
                roomHistory.addLeaf(roomNum, prevGuests);
            }
            currentGuestsName.removeNode(fullName);
            currentGuestsRoom.removeNode(Integer.toString(roomNum));
            CSVWriter writer = new CSVWriter();
            writer.updateEstado(currentGuestsName);
            writer.updateHistorico(roomHistory);
        }
    }
}
    
        
            

