/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuyTuan
 */
public class SimpleArray {
    private final int[] array;
    private int writeIndex = 0;
    private final static Random generator = new Random();

    public SimpleArray(int size) {
        array = new int[size];
    }
    
    public void add(int value){
        int writeIndex = 0;
        int position  = writeIndex;
        try {
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleArray.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        array[position] = value;
        System.out.println(Thread.currentThread().getName() + value + position);
        writeIndex++;
        System.out.println("Next write index : "+writeIndex +" Value : " + array[position]);
    }

    @Override
    public String toString() {
        return "SimpleArray{" + "array=" + array + ", writeIndex=" + writeIndex + '}';
    }
    
}
