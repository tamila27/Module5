package com.goit.gojavaonline;

public class ArrayFactory {
    public static int[] getRandomIntArray(int elementsCount){
        int[] array;
        if(elementsCount <= 0 ){
            array = null;
            System.err.println("elementsCount must be > 0 ");
        } else {
            array = new int[elementsCount];
            for (int i = 0; i < array.length; i++){
                array[i] = (int) Math.round(Math.random() * 100);
            }
        }
        return array;

    }
}
