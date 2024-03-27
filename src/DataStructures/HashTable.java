/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Santiago del Castillo
 * @param <K>
 * @param <V>
 */
public class HashTable<K,V> {
    private HTNode<K,V>[] table;
    private int size;
    private static final float loadFactor = 0.75f;
    private  int entries;
    
    /**
     *
     * @param size
     */
    public HashTable(int size) {
        this.size = size;
        table = new HTNode[size];
    }

    /**
     *
     * @return
     */
    public HTNode<K, V>[] getTable() {
        return table;
    }

    /**
     *
     * @return
     */
    public static float getLoadFactor() {
        return loadFactor;
    }

    /**
     *
     * @return
     */
    public int getEntries() {
        return entries;
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }
    
    /**
     * Adds to the hash table
     *@author Santiago del Castillo
     * @param key
     * @param value
     */
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

    /**
     *
     * @return
     */
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
    
    /**
     *
     * @param key
     * @return
     */
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
    
    /**
     *
     * @return
     */
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

    /**
     * copies the hash table
     *@author Santiago del Castillo
     * @return
     */
    public HashTable<K, V> copyHashTable() {
        HashTable<K, V> copiedTable = new HashTable<>(size);
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                copiedTable.put(table[i].key, table[i].value);
                HTNode<K, V> aux = table[i].next;
                while (aux != null) {
                    copiedTable.put(aux.key, aux.value);
                    aux = aux.next;
                }
            }
        }
        return copiedTable;
    }
    
    /**
     *removes a node from the hash table
     * @author Santiago del Castillo
     * @param key
     * @return
     */
    public HTNode removeNode(K key){
        int index = hash(key);
        HTNode<K,V> head = table[index];
        if(head != null){
            if(head.key.equals(key)){
                HTNode <K, V> node = head;
                table[index] = head.next;
                entries--;
                return node;
            }
        
        HTNode<K,V> prev = null;
        HTNode<K,V> current = head;
        
        while(current != null){
            if(current.key.equals(key)){
                prev.next = current.next;
                entries--;
                return current;
            }
            prev = current;
            current = current.next;
        }
    }
        return null;
}
}
