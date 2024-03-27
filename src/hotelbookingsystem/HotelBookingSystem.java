/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLNode;
import DataStructures.DynamicArray;
import UI.Menu;

/**
 *
 * @author Santiago
 */
public class HotelBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu ui = new Menu();
        Hotel hotel = Hotel.getInstance();
        READERconAVL r = new READERconAVL();
        
       //hotel.checkIn(10203485);

//        try {
//            hotel.checkOut("Corry Poytheras", 236, 10203485);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       hotel.checkIn(10054218);
        
        String roomID = hotel.checkGuest("Winthrop","Arnke");
        if (roomID != null) {
            System.out.println("Room number: " + roomID);
        } else {
            System.out.println("Client not found");
        }
        
        DynamicArray<RoomHistory> a = (DynamicArray) hotel.searchHistoryByRoom(85).getData();
       
        for (RoomHistory p : a) {
            System.out.println(p.getName());
        }
       

        AVLNode<ClientReservation> node = hotel.searchReservationByCi(14597844);
        if (node != null) {
            ClientReservation reservation = node.getData();
            System.out.println(reservation.display()); 
        } else {
            System.out.println("No reservation found ");
        }
        }
    
}
