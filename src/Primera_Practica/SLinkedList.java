/*
  Addfirst
*AddLast
*add
removeFirst
remove last
*remove
*remove
getfisrt
getlast
*get
*set
*cotains
indexof
clear
size
isempty
*toarray
toString
 */
package Primera_Practica;

/**
 *
 * @author BlancaFlor
 */
import java.util.NoSuchElementException;
public class SLinkedList<E> implements List{
    private SNode<E> top;
    private int  size;
    
    public SLinkedList(){
        top= new SNode<E>();
        size=0;
    }
    public void addFirst(E e){
        SNode<E> newNode= new SNode<E>(e);
        newNode.next=top.next;
        top.next=newNode;
        size++;
    }
    @Override
    public E removeFirst(){
        if(top.next== null){
            throw new NoSuchElementException();
        }
        SNode<E> nodeToRemove=top.next;
        top.next=nodeToRemove.next;
        nodeToRemove.next=null;
        size--;
        return nodeToRemove.value;
    }
    @Override
    public E removeLast(){
        if(top.next==null){
            throw new NoSuchElementException();
        }
        SNode<E> current=top;
        while(current.next.next!=null){
            current=current.next;
        }
        SNode<E> nodeToRemove=current.next;
        current.next=null;
        size--;
        return nodeToRemove.value;
                }
    @Override
    public E getFirst(){
        if(top.next==null){
            throw new NoSuchElementException();
        }
        return top.next.value;
    }
    @Override
    public E getLast(){
        if(top.next==null){
            throw new NoSuchElementException();
        }
        SNode<E> current=top.next;
        while(current.next==null){
            current=current.next;
        }
        return current.value;
    }
    @Override
    public int indexOf(Object o){
        int index=0;
        if(o==null){
            for (SNode<E> x=top.next; x!=null;x=x.next){
                if (o.equals(x.value)){
                    return index;
                }
                index++;
            }
        }
        else{
            for (SNode<E> x=top.next; x!=null; x=x.next){
                if(o.equals(x.value)){
                    return index;
                }
                index++;
            }
        }
        return -1;
    }
    
    @Override
    public void clear(){
        top.next=null;
        size=0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return size()==0;
    }
    @Override
    public String toString(){
        if(top.next==null)
            return "[]";
        
        SNode<E> current=top.next;
        String returnValue= "[" + current.value;
        while (current.next!=null){
            current=current.next;
            returnValue += ","+ current.value;
            
        }
        returnValue += "]";
        return returnValue;
    }
    @Override
    public Object[] toArray(){
         if(top.next==null){
            throw new NoSuchElementException();
         }
         SNode<E> current=top.next;
         int largo=this.size;
         Object[] pepito =new Object[largo];
        
        for(int i=0; i<largo; i++){
            pepito[i]=
        }
        return pepito;
    }
    @Override
    public boolean contains(E e){
        
    }
    @Override
    public E set(int index, E element){
        
    }
    @Override
    public E get(int index){
        SNode<E>current=this.top.next;
        for(int i=0; i<index;i++){
            current=current.next;
                  }
        return current.value;
        
    }
    @Override
    public boolean remove(Object o){
        
    }
    @Override
    public E remove(int index){
        
    }
    @Override
    public void add(int index, E element){
        SNode<E> charli=new SNode(element);
        int i=0;
        SNode<E> current=top;
        while (index<i){
            current=current.next;
            i++;
            }
        
        charli.next=current.next;
        current.next=charli;
    }
    @Override
    public void addLast(E e){
        SNode<E> jefry=new SNode(e);
        
        SNode<E> current=top.next;
        while(current.next!=null){
            current=current.next;
           
        }
        jefry .next=null;
        current.next=jefry;
        
      
        
        
    }
    
}
