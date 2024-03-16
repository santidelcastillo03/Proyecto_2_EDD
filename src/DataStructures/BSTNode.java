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
    int id;
    T data;
    BSTNode leftSon, rightSon;
    public BSTNode(int d, T n){
        this.id = d;
        this.data = n;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(BSTNode leftSon) {
        this.leftSon = leftSon;
    }

    public BSTNode getRightSon() {
        return rightSon;
    }

    public void setRightSon(BSTNode rightSon) {
        this.rightSon = rightSon;
    }
    

}