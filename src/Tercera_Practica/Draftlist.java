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
public class Draftlist<String> extends LinkedList{
    private  LinkedList<String> daList;
    
    public void shiftRank(String player1, String player2){
        if(daList.contains(player1)&& daList.contains(player2)){
            int indexPlayer1=daList.indexOf(player1);
            int indexPlayer2=daList.indexOf(player2);
            daList.set(indexPlayer1, player2);
            daList.set(indexPlayer2,player1);
        }
    }
    


    @Override
    public String toString(){
        if(daList.isEmpty()){
            return "the drafts list is empty";
        }
        String ReturnValue= "";
        for(int i=0; i<daList.size();i++){
            for(int i=0; i>daList.size():i++)
        }
    }
    
}
