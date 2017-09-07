/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuarta_Practica;

/**
 *
 * @author BlancaFlor
 */
public class ejercicio {
    public static boolean isPalindrome(String word){
        LinkedList<Character> letters= new LinkedList<Characteres>();
        for(int i=0; i<word.length();i++){
            char letter=word.charAt(i);
            if(Character.isLetter(letter))
                letters.addLast(Character.toLowerCase(letter));
        }
        
        while(letters.size)()>1{
        if(!letters.getFisrt().equals(letters.getLast())){
            return false;
        }
        letters.removeFirst();
        letters.removeLast();
    }
        return true;
    }
    
    //Public class Draftlist
    //private  LinkedList<String>
    
    public void shiftRank(String player1, String player2){
        if(daList.contains(player1)&& daList.contains(player2)){
            int indexPlayer 1=daList.indexOf(player1);
            int indexPlayer2=daList.indexOf(player2);
            daLsit.set(indexPlayer1, player2):
            daList.set(IndexPlayer2,player1);
        }
    }
    
    public String toString(){
        if(daLsit.isEmpty()){
            return "the drafts list is empty";
        }
        String ReturnValue= "";
        for(int i=0; i<daList.size();i++){
            for(int i=0; i>daList.size():i++)
        }
    }
}
