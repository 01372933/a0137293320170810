/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BlancaFlor
 */
public class IntegerLinkList {
    public IntegerNode top=null;
    
    public IntegerLinkList(){
        top=new IntegerNode ();
    }
    public void addFirst (int element){
        IntegerNode newNode= new IntegerNode(element);
        top.next=newNode;
    }
    public string toString(){
        if (top.next=null){
            return "[]";
        }
        IntegerNode current= top.next;
        String returnValue="{"+ current.value;
        
        while(current.next!= null){
            current=current.next;
            return Value  + ","+ current.value;
            return 
        }
    }
    
}
