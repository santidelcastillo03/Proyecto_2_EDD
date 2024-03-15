/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author santiagodelcastillo
 */
public class AVLNode<T extends Comparable<T>> {
    T key;
    int height;
    AVLNode<T> left, right;

    public AVLNode(T key) {
        this.key = key;
        this.height = 1;
    }
}
