/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelbookingsystem;

import DataStructures.AVLNode;
import DataStructures.AVLTree;
import DataStructures.DynamicArray;
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
    
    public void updateHistorico(AVLTree<DynamicArray<RoomHistory>> historicoTree) {
        try (FileWriter writer = new FileWriter("src/CSVFiles/Booking_hotel - Histórico.csv")) {
            writer.append("ci,primer_nombre,apellido,email,genero,llegada,num_hab\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            historicoTree.inOrderTraversal(this::writeRoomHistories);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeRoomHistories(DynamicArray<RoomHistory> roomHistories) {
        for (RoomHistory roomHistory : roomHistories) {
            try (FileWriter writer = new FileWriter("src/CSVFiles/Booking_hotel - Histórico.csv",true)) {
                writer.append(roomHistory.toString()).append('\n');
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
//    public void updateReservas(AVLTree<ClientReservation> reservationsTree) {
//    try (FileWriter writer = new FileWriter("src/CSVFiles/Booking_hotel - reservas.csv")) {
//      writer.append("ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida\n");
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    try {
//        reservationsTree.inOrderTraversal(this::writeClientReservations);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    }

    public void updateReservas(AVLTree<ClientReservation> reservationsTree, String nameToRemove) {
        try {
            FileWriter clearWriter = new FileWriter("src/CSVFiles/Booking_hotel - reservas.csv");
            clearWriter.write("");
            clearWriter.close();

            FileWriter writer = new FileWriter("src/CSVFiles/Booking_hotel - reservas.csv", true);
            writer.append("ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida\n");
            reservationsTree.inOrderTraversal(node -> {
                ClientReservation reservation = node;
                String fullName = reservation.getFirstName() + "," + reservation.getLastName();
                if (!fullName.equals(nameToRemove)) {
                    try {
                        writer.write(reservation.toString() + System.lineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   


    
    //Arreglar rservas que no eleimina en el csv a la persona y arreglar ci en historico csv

}
