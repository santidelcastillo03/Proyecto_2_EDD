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
public class CSVReaderGuestsRooms {
    private String path;
    private BST allGuests;
    private BST allRooms;

    public CSVReaderGuestsRooms(String path) {
        this.path = path;
        this.allGuests = new BST();
        this.allRooms = new BST();
    }
   
    
     public HashTable<String, Guest> readGuests() {
        HashTable<String, Guest> clients = new HashTable<>(100);
        HashTable<String,Room> rooms = readRooms();
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
                    Guest info = new Guest(values[1], values[2], room, values[3], values[4], values[5], values[6]);
                    allGuests.addNode(Integer.parseInt(room.getID()), info);
                    String key = values[1] + " " + values[2];
                    clients.put(key, info);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void printHashTable(HashTable<String, Guest> table) {
        for (String key : table.keys()) {
            System.out.println(table.get(key));
        }
    }

    public void PrintEstado() {
        HashTable<String, Guest> clients = readGuests();
        printHashTable(clients);
        System.out.println(clients.getSize());
    }
    
    public HashTable<String,Room> readRooms() {
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
                allRooms.addNode(Integer.parseInt(ID), room);
                rooms.put(ID,room);
            }
    }catch (IOException e) {
        e.printStackTrace();
    }
        return rooms;
    }
    
    public void printRooms() {
    HashTable<String, Room> rooms = readRooms();
    for (String key : rooms.keys()) {
        System.out.println(rooms.get(key));
    }
}

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BST getAllGuests() {
        return allGuests;
    }

    public void setAllGuests(BST allGuests) {
        this.allGuests = allGuests;
    }

    public BST getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(BST allRooms) {
        this.allRooms = allRooms;
    }
}
