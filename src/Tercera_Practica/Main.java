/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercera_Practica;
import java.util.Arrays;

/**
 *
 * @author BlancaFlor
 */
public class Main {
    /**public static boolean isPalindrome(String word){
        LinkedList<Character> letters= new LinkedList();
        
        for(int i=0; i<word.length();i++){
            char letter=word.charAt(i);
            if(Character.isLetter(letter))
                letters.addLast(Character.toLowerCase(letter));
        }
        
        while(letters.size()>1){
        if(!letters.getFisrt().equals(letters.getLast())){
            return false;
        }
        letters.removeFirst();
        letters.removeLast();
    }
    }*/
    public static int linearSearch(int[] e, int num){
                
                for (int i=0; i<=e.length; i++){
                    return e[i];
                    
                    
                }
                
                return -1;
            }
    
    public static int binariSearch(int[] e, int num){
        int min=0, max=e.length-1,  mid=(max-min)/2;
        while (num!=e[num]){
            
            if(num>=e[mid]){
               min=mid;
               mid=(max-min)/2;
               
            }
            else{
                
            }
            
        }
        return 0;
        
    }
    
    public static void shiftRight(int[] values, int start, int end){
        int temp=values[end];
        for (int i=end; i<=start; i-- ){
            values[i]=values[i-1];
         }
        values[start]=temp;
        
    
    }
    public static void insertionsort(int[] values){
        for(int i=1;i<values.length ; i++){
            if(values[i-1]<values[i]){
                for(int j=0;j<i;j++ ){
                    int temp=values[i];
                    shiftRight(values,j,i);
                    values[j]=temp;
                
            }
                
            }
            
        }
        
    }
    public static void selectionSort(int[] values){
        int min= values[0];
        
        for (int i=0; i<values.length;i++){
            if (values[i]< min){
                min=values[i];
                System.out.println(Arrays.toString(values));
                for(int j=0; j<i;j++){
                    values[i]=values[j];
                    values[0]=min;
                    System.out.println(Arrays.toString(values));

                }
            }
                
                
            }
        }
    public static void buebbleSort(int[] values){
        int var=1;
        int may=values[0];
        while(var!=values.length){
            may=values[0];
            for( int i=1; i<=values.length-var;i++){
                
                if(values[i]<may){
                    values[i-1]=values[i];
                    values[i]=may;
                }
                else if(values[i]>= may){
                    may=values[i];
                }
            }
            var++;
        }
    }
    
    public static void makeHeap(int[] values){
        for( int i=0; i<values.length; i++){
            int index=i;
            while( index !=0){
                int parent= (index-1)/2;
                
            }
        }
    }
        
    

	public static void main(String[] args) {
            /*
		System.out.println("** TEST CIRCULAR DOUBLY-LINKEDLIST CLASS **");
		System.out.println("\t** USING INTEGERS **");
		LinkedList<Integer> iList = new LinkedList<Integer>();
		
		System.out.println("Testing: addFirst(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.addFirst(i);
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: isEmpty + removeFirst + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeFirst();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: addLast(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i=0; i<10; i++) {
			iList.addLast(i);
			System.out.println(iList);	
		}
		System.out.println();

		System.out.println("Testing: isEmpty + removeLast + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeLast();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: add(2 * i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.add(i, i * 2);
			System.out.println(iList);
		}
		System.out.println("Testing: add(4, 7) + toString");
		iList.add(4, 7);
		System.out.println(iList);
		System.out.println("Testing: add(8, 13) + toString");
		iList.add(8, 13);
		System.out.println(iList);
		System.out.println("Testing: add(0, -1) + toString");
		iList.add(0, -1);
		System.out.println(iList);
		System.out.println("Testing: add(size(), 20) + toString");
		iList.add(iList.size(), 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: remove(6) + toString");
		System.out.println(iList);
		iList.remove(6);
		System.out.println(iList);
		System.out.println("Testing: remove(new Integer(6)) + toString");
		iList.remove(new Integer(6));
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: size + indexOf + get");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Get element at index " + iList.indexOf(iList.get(i)) + ": " + iList.get(i));
		}
		System.out.println();
		
		System.out.println("Testing: size + contains");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Is element " + i + " contained in the list? " + iList.contains(i));
		}
		System.out.println();
		
		System.out.println("Testing: getFirst + toString");
		System.out.println(iList);
		System.out.println(iList.getFirst());
		System.out.println();
		
		System.out.println("Testing: getLast + toString");
		System.out.println(iList);
		System.out.println(iList.getLast());
		System.out.println();
		
		System.out.println("Testing: set(3, 20) + toString");
		System.out.println(iList);
		iList.set(3, 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: toArray");
		Object[] array = iList.toArray();
		System.out.println(array);
		if(array != null) {
			for(int i=0; i<array.length; i++)
				System.out.print(array[i] + " ");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Testing: clear + toString");
		System.out.println(iList);
		iList.clear();
		System.out.println(iList);
		System.out.println();
		
		System.out.println("\t** USING STRINGS **");
		LinkedList<String> strLinkedList = new LinkedList<String>();
		strLinkedList.addLast("Hello");
		strLinkedList.addLast("World");
		System.out.println(strLinkedList);
		strLinkedList.remove("World");
		System.out.println(strLinkedList);
		System.out.println();*/
            int[] prueba={20,52,12,98,76,-4};
            int[] empty=new int[0];
            System.out.println(Arrays.toString(prueba));
            buebbleSort(prueba);
            System.out.println(Arrays.toString(prueba));
            
	}
    
}
