/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosRapidos;

import Sexta_Practica.Queue;

/**
 *
 * @author BlancaFlor
 */
public class CodigosQueues {
    Queue fila;

    public CodigosQueues() {
        this.fila = new Queue();
    }
    
    
    
    public void fibonacci(int n){
        System.out.println("1");
        System.out.println("1");
        fila.offer(1);
        fila.offer(1);
        for( int i=0; i<=n ; i++){
            int a= (int) fila.remove();
            int b=(int) fila.element();
            fila.offer(a+b);
            System.out.println(a+b);
        }
    }
    
}
