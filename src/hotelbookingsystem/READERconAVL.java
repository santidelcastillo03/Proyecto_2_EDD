/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLTree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class READERconAVL {
    private AVLTree<ClientReservation> reservasTree;
    private AVLTree<RoomHistory> historicoTree;

    public READERconAVL() {
        this.reservasTree = new AVLTree<>();
        this.historicoTree = new AVLTree<>();
    }

    public AVLTree<RoomHistory> readHistoricoCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/CSVFiles/Booking_hotel - Histórico.csv"))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                RoomHistory roomHistory = new RoomHistory(values[0], values[1], values[2], values[3], values[4], values[5], Integer.parseInt(values[6]));
                historicoTree.addNode(Integer.parseInt(values[0]),roomHistory);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return historicoTree;
    }

    public AVLTree<ClientReservation> readReservasCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/CSVFiles/Booking_hotel - reservas.csv"))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                ClientReservation clientReservation = new ClientReservation(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8]);
                reservasTree.addNode(Integer.parseInt(values[0]),clientReservation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservasTree;
    }
}
