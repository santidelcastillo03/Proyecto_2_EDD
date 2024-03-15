/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

/**
 *
 * @author Angel
 */
import DataStructures.BST;
import DataStructures.BSTNode;
import DataStructures.DynamicArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderReservationHistory {
    private String path;
    private DynamicArray<ClientReservation> allReservations;
    private DynamicArray<RoomHistory> history;

    public CSVReaderReservationHistory(String path) {
        this.path = path;
        this.allReservations = new DynamicArray();
        this.history = new DynamicArray();
    }

    public BST readReservations() {
        BST bst = new BST();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String ci = values[0];
                String firstName = values[1];
                String lastName = values[2];
                String email = values[3];
                String gender = values[4];
                String roomType = values[5];
                String phoneNum = values[6];
                String arrival = values[7];
                String departure = values[8];

                ClientReservation reservation = new ClientReservation(ci, firstName, lastName, email, gender, roomType, phoneNum, arrival, departure);
                allReservations.add(reservation);
                bst.addNode(Integer.parseInt(ci), reservation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bst;
    }
    
public BSTNode searchBST(int ci, BST bst) {    
        BSTNode current = bst.getRoot();
        while (current != null) {
            if (ci == current.getId()) {
                return current;
            } else if (ci < current.getId()) {
                current = current.getLeftSon();
            } else {
                current = current.getRightSon();
                }
    }
    return null; // Return null if the reservation with the given ID is not found
} // @author Angel 
    
    public BST readHistory() {
        BST bst = new BST();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String ci = values[0];
                String firstName = values[1];
                String lastName = values[2];
                String email = values[3];
                String gender = values[4];
                String arrival = values[5];
                String roomNum = values[6];
                RoomHistory prevGuest = new RoomHistory(ci, firstName, lastName, email, gender, arrival, Integer.parseInt(roomNum));
                
                BSTNode nodeExists = searchBST(Integer.parseInt(roomNum), bst);
                
                if(nodeExists != null){
                    DynamicArray<RoomHistory> list = (DynamicArray) nodeExists.getData();
                    list.add(prevGuest);
                } else{
                    DynamicArray<RoomHistory> list = new DynamicArray();
                    list.add(prevGuest);
                    bst.addNode(Integer.parseInt(roomNum), list);
                }
                history.add(prevGuest);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bst;
    }
        
}

