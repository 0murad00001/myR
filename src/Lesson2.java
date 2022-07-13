package src;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args){
//////////////////////Задание1///////////////////////////
     System.out.println("Задание 1");
Scanner scanner = new Scanner(System.in);
int x = scanner.nextInt();
if(x>=1 && x<=4){
    System.out.println("Малоэтажный дом");
}if (x>=5 && x<=8){
            System.out.println("Среднеэтажный дом");
}if (x>=9){
            System.out.println("Многоэтажный дом");
}if (x<=0){
            System.out.println("Ошибка ввода");
        }





///////////////////////////Задание2//////////////////////////
        System.out.println("Задание 2");
        Scanner scanner1 = new Scanner(System.in);
        int chiclo1 = scanner1.nextInt();
        int chiclo2 = scanner1.nextInt();
                    for (int i =chiclo1+1; i<chiclo2; i++){
                if(i % 5 == 0 && i % 10 != 0) {
                    System.out.print (i +" ");
                }
            }



////////////////////Задание 3 ////////////////////////
        System.out.println("Задание 3");
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();
        int b = scanner2.nextInt();
        int counter=a+1;
        while(counter>=a && counter<b ){
            if(counter%5==0 && counter%10 !=0){
            System.out.println(counter);}

            counter++;
        }

////////////////Задание 4////////////////////
       System.out.println("Задание 4");
        Scanner scanner3 = new Scanner(System.in);
        double d = scanner3.nextDouble();
        double y;
        if(d>-3 && d< 5){
            y = (d+3)*(d*d-2);
        } else if(d>=5){
            y = (Math.pow(d,2)-10)/(d+7);
        } else{
            y = 420;
        }
        System.out.println(y);

    }
}
