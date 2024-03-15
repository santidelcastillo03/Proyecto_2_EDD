/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.BST;
import DataStructures.DynamicArray;
import DataStructures.HashTable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author santiagodelcastillo
 */
public class
CSVReader {
    private String path;

    public CSVReader(String path) {
        this.path = path;
    }
   
    
     public HashTable<String, ClientRoomSearch> readEstado() {
        HashTable<String, ClientRoomSearch> clients = new HashTable<>(100);
        HashTable<String,Room> rooms = readHabitaciones();
        String line;
        Room previousRoom = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/CSVFiles/Booking_hotel - estado.csv"))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values= line.split(",");
                Room room;
                if (values[0] != null && !values[0].isEmpty()) {
                    room = rooms.get(values[0]);
                    previousRoom = room;
                }else {
                    room = previousRoom;
                }
                if (room != null) {
                    ClientRoomSearch info = new ClientRoomSearch(values[1], values[2], room, values[3], values[4], values[5], values[6]);
                    String key = values[1] + " " + values[2];
                    clients.put(key, info);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void printHashTable(HashTable<String, ClientRoomSearch> table) {
        for (String key : table.keys()) {
            System.out.println(table.get(key));
        }
    }

    public void PrintEstado() {
        HashTable<String, ClientRoomSearch> clients = readEstado();
        printHashTable(clients);
        System.out.println(clients.getSize());
    }

    public AVLTree<ReservationSearch> readReservas() {
        
    }
    
    public AVLTree<RoomHistory> readHistorico() {
        
    }
    
    public HashTable<String,Room> readHabitaciones() {
        HashTable<String,Room> rooms = new HashTable<>(100);
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("src/CSVFiles/Booking_hotel - habitaciones.csv"))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String ID = values[0];
                String type = values[1];
                String level = values[2];
                Room room = new Room(ID, type, level);
                rooms.put(ID,room);
            }
    }catch (IOException e) {
        e.printStackTrace();
    }
        return rooms;
    }
    
    public void printRooms() {
    HashTable<String, Room> rooms = readHabitaciones();
    for (String key : rooms.keys()) {
        System.out.println(rooms.get(key));
    }
}
}
