/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera_Practica;

/**
 *
 * @author BlancaFlor
 */
public class LinkedList<E> implements List <E> {
    private Node<E> header;
    private int size;
    
    public LinkedList(){
        header=new Node<E>();
        size=0;
    }
    /**
     * Gets the node at the specified index.
     * 
     * @param index the index of the node to gets
     * @return 
     */
    
    private Node<E> node(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        
        if(index<(size<<1)){
            Node<E> x= header.next;
            for 
        }
        
    }
}
