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
        Hotel hotel = new Hotel(100,"src/CSVFiles/Booking_hotel - estado.csv"
        );
        CSVReader csvr = new CSVReader("src/CSVFiles/Booking_hotel - estado.csv");
        csvr.PrintEstado();
        String roomID = hotel.checkClient("Tasha","Delf");
        if (roomID != null) {
            System.out.println("Room number: " + roomID);
        } else {
            System.out.println("Client not found");
        }
       
    }
    
}
