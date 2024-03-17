/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelbookingsystem;
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
        CSVReaderGuestsRooms csvr = new CSVReaderGuestsRooms("src/CSVFiles/Booking_hotel - estado.csv");
        csvr.PrintEstado();
        csvr.printRooms();
        String roomID = hotel.checkGuest("Diane","Devote");
        if (roomID != null) {
            System.out.println("Room number: " + roomID);
        } else {
            System.out.println("Client not found");
        }
       
    }
    
}
