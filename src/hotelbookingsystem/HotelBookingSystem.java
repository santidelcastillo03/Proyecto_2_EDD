/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.DynamicArray;

/**
 *
 * @author Santiago
 */
public class HotelBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        READERconAVL r = new READERconAVL();
        
        String roomID = hotel.checkGuest("Diane","Devote");
        if (roomID != null) {
            System.out.println("Room number: " + roomID);
        } else {
            System.out.println("Client not found");
        }
        
        DynamicArray<RoomHistory> a = (DynamicArray) hotel.searchHistoryByRoom(1).getData();
       
        for (RoomHistory p : a) {
            System.out.println(p.getName());
        }
       

        System.out.println(hotel.searchReservationByCi(17153797).getData());
    }
    
}
