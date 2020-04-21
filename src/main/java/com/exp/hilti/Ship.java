package com.exp.hilti;

import java.util.Hashtable;
import java.util.function.Function;

public class Ship {
	

    public Ship(Hashtable<Integer, Integer> containers ,int containerCount, Function<Integer, Integer> fillContainer) {
        //this.containers = new Hashtable<Integer, Integer>();

        for (int i = 0; i < containerCount; i++) {
            containers.put(i, fillContainer.apply(i));
        }
    }

   
    
    public static void main(String[] args) {
    	Hashtable<Integer, Integer> containers = new Hashtable<Integer, Integer>() ;
   
 
        Ship ship = new Ship(containers ,10, containerIndex -> containerIndex);

        for (int i = 0; i < 10; i++) {
            System.out.println("Container: " + i + ", cargo: " + containers.get(i));
        }
    }
    
    
}
