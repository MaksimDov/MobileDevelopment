package com.maksim.lab1;

public class MinMaxClass {

    /**
     *
     * @param a - first value
     * @param b - second value
     * @return - min of 'a' and 'b'
     */
    public int min(int a, int b){
        if(a < b){
            return a;
        }
        else {
            return b;
        }
    }

    /**
     *
     * @param a - first value
     * @param b - second value
     * @return - max of 'a' and 'b'
     */
    public int max(int a, int b){
        if(a > b){
            return a;
        }
        else {
            return b;
        }
    }
}
