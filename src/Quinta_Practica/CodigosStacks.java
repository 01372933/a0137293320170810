/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quinta_Practica;

/**
 *
 * @author BlancaFlor
 */

import java.lang.String;
public class CodigosStacks<E>{
     Stack pila1;
     Stack pila2;
    public CodigosStacks(Stack pila1, Stack pila2) {
        this.pila1 = new Stack();
        this.pila2 = new Stack();
    }
     
    
   /*  public boolean balanceoDeCaracteres(String str){
         char[] arr=str.toCharArray();
         int num=0;
        
        
        for(int i=0; i<=arr.length-1;i++){
            if (arr[i]=='{'){
                num++;
                pila1.Push(arr[i]);
            }
            else if (arr[i]=='['){
                num++;
                pila1.Push(arr[i]);
            }
            else if (arr[i]=='('){
                num++;
                pila1.Push(arr[i]);
            }
            else if (arr[i]==')'){
                num--;
                pila1.Push(arr[i]);
            }
            else if (arr[i]==']'){
                num--;
                pila1.Push(arr[i]);
            }
            else if (arr[i]=='}'){
                num--;
                pila1.Push(arr[i]);
            }
            
        }
        if (num !=0|| pila1.size()%2==.5){
            return false;
        }
        char[] arrPila1=pila1.toArray();
        for(int i =0; i<=arrPila1.length-1; i++){
            if(arrPila1[i]=='}'||arrPila1[i]==']'||arrPila1[i]==')'){
                pila2.Push(arrPila1[i]);
            }
            if(arrPila1[i]=='('){
                if (pila2.peek()!= ')'){
                    return false;
                }
                pila2.pop();
              }
            if(arrPila1[i]=='['){
                if (pila2.peek()!= ']'){
                    return false;
                }
                pila2.pop();
              }
            if(arrPila1[i]=='{'){
                if (pila2.peek()!= '}'){
                    return false;
                }
                pila2.pop();
              }
        }
    if(pila2.size>0){
        return false;
    }
    return true;
    */
    
    

public  void destroyParentheses(int a, int b, char[] caracteres){
      
        for (int i=b; i<=a; i-- ){
            caracteres[i]=caracteres[i-1];
         }
        for (int i=a; i<=caracteres.length; i++ ){
            caracteres[i]=caracteres[i+2];
         }
        
        
        
        
        
         
     }
     
     public char[] parentheses(int a, int b, char[] caracteres){
         int j=b-1;
        
            for (int i=a+1; i<=(a+b-1)/2; i++){
                
                char caracter=caracteres[i];
                char[i]=char[j];
                char[j]=caracter;
                j--;
                 }
             
             
            }
         
         
    destroyParentheses( a, b, caracteres);
     return caracteres[];
         
     }
    
     
     public String reverseParentheses(String str){
         char[] arr=str.toCharArray();
         for( int i=0; i<=arr.length-1; i++){
             if(arr[i]=='('){
                 pila1.Push(i);
             }
             else if(arr[i]==')'){
                 parentheses(pila1.pop(),i, arr);
                 i=0;
                 clear(pila1);

             }
         }
         String invertido="";
        for(int i=0; i<=arr.length-1;i++){
            invertido=invertido.append(arr[i]);
        }
        return invertido; 
     }

public void clear( Stack pila){
    while(pila.empty()!=false){
    pila.pop();
}
}

    
}
