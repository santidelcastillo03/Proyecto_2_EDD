/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Angel
 */
public class BSTNode<T> {
    int data;
    T name;
    BSTNode leftSon, rightSon;
    public BSTNode(int d, T n){
        this.data = d;
        this.name = n;
        this.leftSon = null;
        this.rightSon = null;
    }
    public String toString(){
        return name + "sus datos son: " + data;
    }

}