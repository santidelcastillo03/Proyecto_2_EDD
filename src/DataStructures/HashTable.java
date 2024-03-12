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
    private  HTNode<K,V>[] table;
    private int size;
    private static final float loadFactor = 0.75f;
    private  int entries;
    
    public HashTable(int size) {
        this.size = size;
        table = new HTNode[size];
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }
    
    public void put(K key, V value) {
        if (entries >= size * loadFactor) {
            rehash();
        }
        
        int index = hash(key);
        HTNode<K,V> node = new HTNode<>(key, value);
        if (table[index] == null) {
            table[index] = node;
        }else {
            HTNode<K,V> aux = table[index];
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

    public int getSize() {
        return size;
    }
    
    private void rehash(){
        size *= 2;
        HTNode<K,V>[] oldTable = table;
        table = new HTNode[size];
        entries = 0;
        for (HTNode<K,V> node : oldTable) {
            if (node != null) {
                put(node.key, node.value);
                HTNode<K,V> aux = node.next;
                while (aux != null) {                    
                    put(aux.key, aux.value);
                    aux = aux.next;
                }
            }
        }
    }
    
    public V get(K key) {
        int index = hash(key);
        HTNode<K,V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    
    public DynamicArray<K> keys() {
        DynamicArray<K> keys = new DynamicArray<>();
        for (HTNode<K,V> node : table) {
            while (node != null) {
                keys.add(node.key);
                node = node.next;
            }
        }
        return keys;
    }
}
