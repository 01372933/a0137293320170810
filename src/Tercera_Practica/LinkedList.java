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
import java.util.NoSuchElementException;
public class LinkedList<E> implements List <E> {
    private Node<E> header;
    private int size;
    
    public LinkedList(){
        header=new Node<E>();
        size=0;
    }
  /**a3
	 * Gets the node at the specified index.
	 * @param index the index of the node to get
	 * @return the node at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 */
	private Node<E> node(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
	}

	@Override
	public void addFirst(E e) {
            Node<E> newNode= new Node<E>(e),
            first=header.next;
            first.prev=newNode;
            header.next=newNode;
            newNode.next=first;
            newNode.prev=header;
            
            this.size++;
            
		
	}

	@Override
	public void addLast(E e) {
		Node<E> newNode= new Node<E>(e),
                last=header.prev;
                last.next=newNode;
                newNode.next=header;
                newNode.prev=last;
                
                this.size++;
		
	}

	@Override
	public void add(int index, E element) {
		Node<E> newNode= new Node<E>(element);
                int i=0;
                while(i<index){
                    i++;
                }
		
	}

	@Override
	public E removeFirst() {
            Node<E> nodo=header.next;
            Node<E>  node=this.header.next.next;
            this.header.next=node;
            node.prev=this.header;
            nodo.next=null;
            nodo.prev=null;
            size --;
                
		return null;
	}

	@Override
	public E removeLast() {
            Node<E> nodo=header.prev;
            Node<E>  node=this.header.prev.prev;
            this.header.prev=node;
            node.next=this.header;
            nodo.next=null;
            nodo.prev=null;
            size --;
		 
		return null;
	}

	@Override
	public E remove(int index) {
		
            Node<E> s= this.header.next;    
            for (int i=0; i<index-1; i++){
                s=s.next;}
            Node<E> r=s.next;
            Node<E> t=s.next.next;
            s.next=t;
            t.prev=s;
            r.next=null;
            r.prev=null;
            size--;
            
		return r.value;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return header.next.value;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return header.prev.value;
	}

	@Override
	public E get(int index) {
		Node<E> s= this.header.next;    
            for (int i=0; i!=index; i++){
                s=s.next;}
		return s.value;
	}

	@Override
	public E set(int index, E element) {
		Node<E> s= this.header.next;    
            for (int i=0; i!=index; i++){
                s=s.next;}
            s.value=element;
		return s.value;
	}

	@Override
	public boolean contains(E e) {
		if(this.indexOf(e)==-1){
                  return false; 
                }
                return true;
	}

	@Override
	public int indexOf(Object o) {
            //Node<E> newNode= new Node<E>(e);
            Node<E> current=header;
            if(o==null){
                for(int i=0;i<size ; i++){
                    current=current.next;
                    if (current.value==null){
                        return i;
                    }
                    
                }
                
            }
            else{
                for(int i=0; i<size ; i++){
                    current=current.next;
                    if(current.value.equals(o)==true ){
                        return i;
                    }
            }
                
		
	}
            return -1;
        }

	@Override
	public void clear() {
		this.header.next=this.header;
                this.header.prev=this.header;
                size=0;
		
	}

	@Override
	public int size() {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.header.next==this.header;
	}

	@Override
	public Object[] toArray() {
		Object[] returnArray = new Object[size];
                Node<E> nodo=header.next;
		
		
		for(int i=0;i< size; i++){
                    returnArray[i]=nodo.value;
                    nodo=nodo.next;
                }
                return returnArray;
                    
	}
	
	@Override
	public String toString() {
		if(header.next == null)
			return "[]";
		
		Node<E> current = header.next;
		String returnValue = "[" + current.value;
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
		return returnValue;
	}
}
