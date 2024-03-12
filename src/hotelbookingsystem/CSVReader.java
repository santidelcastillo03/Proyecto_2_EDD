/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.HashTable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author santiagodelcastillo
 */
public class CSVReader {
    private String path;

    public CSVReader(String path) {
        this.path = path;
    }
   /*
    public DynamicArray<ClientSearch> read() {
        DynamicArray<ClientSearch> infoArr = new DynamicArray<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            while ((line = br.readLine()) != null) {                
                String[] values= line.split(",");
                Room room = null;
                if (values[0] != null && !values[0].isEmpty()) {
                    room = new Room(values[0]);
                }
                if (room != null) {
                    ClientSearch info = new ClientSearch(values[1], values[2], room);
                    infoArr.add(info);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return infoArr;
    }
    
    public void printArray(DynamicArray<ClientSearch> array) {
        for (ClientSearch clientSearch : array) {
            System.out.println(clientSearch);
        }
    }
    
    public void readAndPrint() {
    DynamicArray<ClientSearch> infoArr = read();
    printArray(infoArr);
}*/
    
     public HashTable<String, ClientRoomSearch> readEstado() {
        HashTable<String, ClientRoomSearch> clients = new HashTable<>(100);
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values= line.split(",");
                Room room = null;
                if (values[0] != null && !values[0].isEmpty()) {
                    room = new Room(values[0]);
                }
                if (room != null) {
                    ClientRoomSearch info = new ClientRoomSearch(values[1], values[2], room);
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

    public void PrintAll() {
        HashTable<String, ClientRoomSearch> clients = readEstado();
        printHashTable(clients);
        System.out.println(clients.getSize());
    }
    /*
    public HashTable<String, ClientSearch> DArrToHT(DynamicArray<ClientSearch> array) {
        HashTable<String, ClientSearch> clients = new HashTable<>(array.size());
        for (ClientSearch clientSearch : array) {
            String key = clientSearch.getLastName() + "," + clientSearch.getName();
            clients.put(key, clientSearch);
        }
        return clients;
    }*/
}
