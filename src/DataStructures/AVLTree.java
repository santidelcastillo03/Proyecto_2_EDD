/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author santiagodelcastillo
 */
public class AVLTree<T extends Comparable<T>> {
    private AVLNode<T> root;

    private int height(AVLNode<T> N) {
        if (N == null)
            return 0;
        return N.height;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private AVLNode<T> rightRotate(AVLNode<T> y) {
        AVLNode<T> x = y.left;
        AVLNode<T> T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private AVLNode<T> leftRotate(AVLNode<T> x) {
        AVLNode<T> y = x.right;
        AVLNode<T> T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    private int getBalance(AVLNode<T> N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    public void addNode(int key, T data) {
        root = insert(root, key, data);
    }

    private AVLNode<T> insert(AVLNode<T> node, int key, T data) {
        if (node == null){
            return (new AVLNode<T>(key, data));
        }
        if (key < 0){
            node.left = insert(node.left, key, data);
        }
        else if (key > 0){
            node.right = insert(node.right, key, data);
        }
        else{
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < 0){
            return rightRotate(node);
        }

        if (balance < -1 && key > 0){
            return leftRotate(node);
        }

        if (balance > 1 && key > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public AVLNode<T> getRoot() {
        return root;
    }

    public void setRoot(AVLNode<T> root) {
        this.root = root;
    }
    
    public AVLNode<T> search(int key) {
    AVLNode<T> current = root;
    while (current != null) {
        if (key < current.key) {
            current = current.left;
        } else if (key > current.key) {
            current = current.right;
        } else {
            return current;
        }
    }
    return null;
}
    
}