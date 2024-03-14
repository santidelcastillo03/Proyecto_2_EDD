/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Angel
 */
public class BST {
    BSTNode root;
    public BST(){
        root = null;
    }
    //INSERT NODE (METHOD)
    public void addNode(int d, String n){
        BSTNode newn = new BSTNode(d,n);
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
}