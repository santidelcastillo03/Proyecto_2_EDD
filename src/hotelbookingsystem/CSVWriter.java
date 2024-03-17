/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLTree;
import DataStructures.HashTable;

import java.io.*;
/**
 *
 * @author Santiago
 */
public class CSVWriter {
    public void updateEstado(HashTable<String, Guest> table) {
        try (FileWriter writer = new FileWriter("src/CSVFiles/Booking_hotel - estado.csv")) {
            writer.append("num_hab,primer_nombre,apellido,email,genero,celular,llegada\n");
            for (String key : table.keys()) {
                Guest guest = table.get(key);
                writer
                        .append(guest.toString())
                        .append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
