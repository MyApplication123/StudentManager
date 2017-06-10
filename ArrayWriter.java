/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethread;

/**
 *
 * @author DuyTuan
 */
public class ArrayWriter implements Runnable{
    private final SimpleArray shareSimpleArray;
    private final int startValue;
    @Override
    
    public  void run() {
        for(int i = startValue;i<startValue+3;i++){
            shareSimpleArray.add(i);
        }
    }

    public ArrayWriter(SimpleArray shareSimpleArray, int startValue) {
        this.shareSimpleArray = shareSimpleArray;
        this.startValue = startValue;
    }
    
}
