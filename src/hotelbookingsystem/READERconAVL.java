/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLNode;
import DataStructures.AVLTree;
import DataStructures.DynamicArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class READERconAVL {
    private AVLTree<ClientReservation> reservasTree;
    private AVLTree<DynamicArray<RoomHistory>> historicoTree;

    public READERconAVL() {
        this.reservasTree = new AVLTree<>();
        this.historicoTree = new AVLTree<>();
    }

    public AVLTree<RoomHistory> readHistoricoCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/CSVFiles/Booking_hotel - Histórico.csv"))) {
            String line;
            br.readLine();
            int i = 0;
            while ((line = br.readLine()) != null) {
                i++;
                String[] values = line.split(",");
                RoomHistory roomHistory = new RoomHistory(values[0], values[1], values[2], values[3], values[4], values[5], Integer.parseInt(values[6]));
                
                AVLNode nodeExistsAlready = historicoTree.search(Integer.parseInt(values[6]));
                if(nodeExistsAlready != null){
                    DynamicArray<RoomHistory> a = (DynamicArray) nodeExistsAlready.getData();
                    a.add(roomHistory);
                } else{
                    DynamicArray<RoomHistory> prevGuests = new DynamicArray();
                    prevGuests.add(roomHistory);
                    historicoTree.addNode(Integer.parseInt(values[6]), prevGuests);
                }
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
                int key = checkCi(values[0]);
                ClientReservation clientReservation = new ClientReservation(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8]);
                reservasTree.addNode(key, clientReservation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservasTree;
    }
    
    public int checkCi(String ci) {
        String checkCi = ci.replace(".", "");
        return Integer.parseInt(checkCi);
    }
}
