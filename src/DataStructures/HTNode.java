/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *Node for the hash table
 * @author Santiago del Castillo
 * @param <K>
 * @param <V>
 */
public class HTNode<K,V> {
    K key;
    V value;
    HTNode<K,V> next;

    /**
     *
     * @param key
     * @param value
     */
    public HTNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     *
     * @return
     */
    public K getKey() {
        return key;
    }

    /**
     *
     * @param key
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     *
     * @return
     */
    public V getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }
    
    
}
