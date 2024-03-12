/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.HashTable;

/**
 *
 * @author santiagodelcastillo
 */
public class Hotel {
    private HashTable<String, ClientRoomSearch> clients;
    private CSVReader csvReader;

    public Hotel(int size, String csvPath) {
        this.clients = new HashTable<>(size);
        this.csvReader = new CSVReader(csvPath);
        this.clients = csvReader.readEstado();
    }

    public void uploadClient(ClientRoomSearch client) {
        String key = client.getName() + " " + client.getLastName();
        clients.put(key, client);
    }

    public String checkClient(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        ClientRoomSearch client = clients.get(key);
        return client != null ? client.getRoom().getID() : null;
    }
}
