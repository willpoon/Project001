package com.poon;

import java.util.Random;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
//        System.out.println(randomArray(10)[0]);
//        System.out.println(randomArray(10)[1]);
//        int[] arr = randomArray(10);
//        System.out.println(arr.length);
        printArray(randomArray(9));
        System.out.println(Arrays.toString(randomArray(9))); // 使用Arrays.toString , 不用再遍历每一个元素再打印。
    }

    static int[] randomArray(int Cnt){
        int randomArr[] = new int[Cnt];
        Random r = new Random();
        for(int i = 0 ; i < Cnt ; i++){
            randomArr[i] = r.nextInt(100);
        }
        return randomArr;
    }

    static void printArray(int[] a ){
       for (int i = 0 ; i < a.length ; i++ ){
           System.out.println(a[i]);
       }
    }
}
