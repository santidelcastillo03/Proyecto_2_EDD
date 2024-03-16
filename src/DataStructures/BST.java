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
    public void addNode(int d, T n){
        BSTNode newn = new BSTNode(d, n);
        if(root==null){
            root=newn;
        }else{
            BSTNode auxiliar=root;
            BSTNode father;
            while(true){
                father=auxiliar;
                if(d<auxiliar.data){
                    auxiliar=auxiliar.leftSon;
                    if(auxiliar==null){
                        father.leftSon = newn;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.rightSon;
                    if(auxiliar==null){
                        father.rightSon= newn;
                        return;
                    }
                }
            }
        }
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
        while (current != null && current.data != key) {
            if (key < current.data) {
                current = current.leftSon;
            } else {
                current = current.rightSon;
            }
        }
        return current;
    }
    //CHECK IF TREE IS EMPTY METHOD
    public boolean isEmpty(){
        return root==null;
    }

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }
    
}

