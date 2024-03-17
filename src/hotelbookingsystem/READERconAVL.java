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
    private AVLTree<RoomHistory> historicoTree;

    public READERconAVL(String path) {
        this.reservasTree = new AVLTree<>();
        this.historicoTree = new AVLTree<>();
    }

    public AVLTree<RoomHistory> readHistoricoCSV(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                RoomHistory roomHistory = new RoomHistory(values[0], values[1], values[2], values[3], values[4], values[5], Integer.parseInt(values[6]));
                
                AVLNode nodeExistsAlready = historicoTree.search(Integer.parseInt(values[6]));
                if(nodeExistsAlready != null){
                    DynamicArray<RoomHistory> a = (DynamicArray) nodeExistsAlready.getData();
                    a.add(roomHistory);
                } else{
                    DynamicArray<RoomHistory> prevGuests = new DynamicArray();
                    historicoTree.addNode(Integer.parseInt(values[6]), roomHistory);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return historicoTree;
    }

    public AVLTree<ClientReservation> readReservasCSV(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println("->");
                System.out.println(values[0]);
                System.out.println("->");
                System.out.println(values[1]);
                System.out.println("->");
                System.out.println(values[2]);
                System.out.println("->");
                System.out.println(values[3]);
                System.out.println("->");
                System.out.println(values[4]);
                System.out.println("->");
                System.out.println(values[5]);
                System.out.println("->");
                System.out.println(values[6]);
                System.out.println("->");
                System.out.println(values[7]);
                System.out.println("->");
                System.out.println(values[8]);
                ClientReservation clientReservation = new ClientReservation(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8]);
                reservasTree.addNode(Integer.parseInt(values[0]), clientReservation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservasTree;
    }
}
