/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Santiago
 */
public class HashTable<K,V> {
    private  Node<K,V>[] table;
    private int size;
    private static final float loadFactor = 0.75f;
    private  int entries;
    
    public HashTable(int size) {
        this.size = size;
        table = new Node[size];
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }
    
    private void put(K key, V value) {
        if (entries >= size * loadFactor) {
            rehash();
        }
        
        int index = hash(key);
        Node<K,V> node = new Node<>(key, value);
        if (table[index] == null) {
            table[index] = node;
        }else {
            Node<K,V> aux = table[index];
            while (aux.next != null) {                
                if (aux.key.equals(key)) {
                    aux.value = value;
                    return;
                }
                aux = aux.next;
            }
            if (aux.key.equals(key)) {
                aux.value = value;
            }else {
                aux.next = node;
            }
        }
        entries++;
    }
    
    private void rehash(){
        size *= 2;
        Node<K,V>[] oldTable = table;
        table = new Node[size];
        entries = 0;
        for (Node<K,V> node : oldTable) {
            if (node != null) {
                put(node.key, node.value);
                Node<K,V> aux = node.next;
                while (aux != null) {                    
                    put(aux.key, aux.value);
                    aux = aux.next;
                }
            }
        }
    }
}
