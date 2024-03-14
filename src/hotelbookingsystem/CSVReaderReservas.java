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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderReservas {
    private String path;

    public CSVReaderReservas(String path) {
        this.path = path;
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

                ClientReservationSearch reservation = new ClientReservationSearch(ci, firstName, lastName, email, gender, roomType, phoneNum, arrival, departure);
                bst.addNode(Integer.parseInt(ci), reservation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bst;
    }
}

