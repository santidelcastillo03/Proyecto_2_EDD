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
    private HashTable<String, Client> clients;
    
    
    public Hotel(int size) {
        this.clients = new HashTable<>(size);
    }
    
    public void registryOfClient(Client client) {
        String key = client.getLastName() + ","+ client.getName();
        clients.put(key,client);
    }
    
    public void getClientRoom() {
        
    }
}
