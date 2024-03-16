/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Angel
 */
public class BST<T> {
    BSTNode root;
    public BST(){
        root = null;
    }
    //INSERT NODE (METHOD)
    
    public void addNode(int id, T data) {
        BSTNode newn = new BSTNode(id, data);
        if (root == null) {
            root = newn;
        } else {
            root = insert(root, newn);
        }
    }

    private BSTNode insert(BSTNode current, BSTNode newNode) {
        if (current == null) {
            return newNode;
        }

        if (newNode.id < current.id) {
            current.leftSon = insert(current.leftSon, newNode);
        } else {
            current.rightSon = insert(current.rightSon, newNode);
        }

        return current;
    }

    // INORDER TRAVERSAL METHOD
    public void inorderTraversal(BSTNode r) {
        if (r != null) {
            inorderTraversal(r.leftSon);
            System.out.print(r.data);
            inorderTraversal(r.rightSon);
        }
    }

    // SEARCH METHOD
    public BSTNode search(int key) {
        BSTNode current = root;
        while (current != null && current.id != key) {
            if (key < current.id) {
                current = current.leftSon;
            } else {
                current = current.rightSon;
            }
        }
        return current;
    }

    // CHECK IF TREE IS EMPTY METHOD
    public boolean isEmpty() {
        return root == null;
    }

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

}
