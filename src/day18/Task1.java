package src.day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers,0));
    }

    static int summ =0;
    static int recursionSum(int[] n, int i){
        if(i==n.length){
            return 0;
        }

        return n[i] + recursionSum(n, i+1);
    }
}





/*
        int[] numbers = {1, 10};
        System.out.println(recursionSum(numbers,numbers.length-1));
    }

    static int sum=0;

    static public int recursionSum(int[] n, int i){
        if(i<0){
            return 454; //тут что 454 вернуть что 1 все равно работает, почему?
        }

        sum = n[i] + sum;
        recursionSum(n, i-1);
        return sum;*/