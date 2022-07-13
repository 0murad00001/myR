package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Lesson4 {
    public static void main(String[] args) {
                              ///////////////////Задание1/////////////////////////
        System.out.println("                Задание 1");
        System.out.println();
        System.out.println("fff");
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
        System.out.println();
        int vvodChisla = scanner.nextInt();

        int[] massiv = new int[vvodChisla];
        int counter = 0;
        int summ=0;

        for(int i =0; i<massiv.length; i++){
            massiv[i] = random.nextInt(0,10);
        }

        for (int x:massiv){
            System.out.print( x + " ");
            if(x>8){                       //Проверка чисел больше8
                counter= counter+1;
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Длинна массива - "+ massiv.length);           //Вывод длинны массива

        System.out.println("Количестве чисел больше 8 - " +counter);      //Вывод на печать количеста чисел больше 8
        counter=0;                                                        //Обнуление счетчика



        for(int x:massiv){
            if(x==1){                      // Проверка чисел равных 1
                counter =counter+1;
            }
        }

        System.out.println("Количестве чисел равных 1 - " +counter);      //Вывод количества чисел равных 1
        counter=0;                                                        //Обнуление счетчика

        for (int x:massiv){
            if(x%2==0){                     //Проверка четных чисел
                counter=counter+1;
            }
        }

        System.out.println("Количество четных чисел  - " +counter);      //Вывод количества четных чисел
        counter=0;                                                        //Обнуление счетчика

        for (int x:massiv){
            if(x%2==1){                     //Проверка нечетных чисел
                counter=counter+1;
            }
        }
        System.out.println("Количество нечетных чисел  - " +counter);      //Вывод количества нечетных чисел
        counter=0;                                                        //Обнуление счетчика

        for (int x:massiv){
            summ = x+summ;
        }
        System.out.println("Сумма элементов массива  - " +summ);      //Сумма массива
        summ=0;                                                        //Обнуление счетчика
        vvodChisla =0;
        System.out.println();


                                    //////////////////Задание2/////////////////////////
        System.out.println("                Задание 2");
        vvodChisla=scanner.nextInt();
        massiv =new int[vvodChisla];
        int max =10000;
        int min =0;
        for (int i=0; i<massiv.length; i++){
            massiv[i]=random.nextInt(min,max);
        }

        for(int x:massiv){
            System.out.print(x+ " ");  //Вывод всего массива
        }
        System.out.println();

        for(int x:massiv){
            if(x>summ){             //Проверка наибольшего эллемента массива
                summ=x;
            }
        }
        System.out.println();
        System.out.println("Наибольший элемент массива- "+ summ); //Вывод наибольше эллмента массива
        summ =0;


        for(int x:massiv){
            if(summ==0) {
               summ= max;            //Я сделал так на случай если рэндом будет не от 0 до 10000, а предположим до 1000000,если сканером вбивать максимальный и минимальный рэндом
            }
            if(x<summ ){             //Проверка наименьшего эллемента массива
                summ=x;
            }
        }
        System.out.println("Наименьший элемент массива- "+ summ); //Вывод наименьший эллмента массива
        summ =0;

        for(int x:massiv){

            if(x%10==0 ){             //Проверка наименьшего эллемента массива
                counter=counter+1;
                summ=x+summ;
            }
        }
        System.out.println("Количество эллементов  массива оканчивающихся на 0- "+ counter); //
        System.out.println("Сумма эллементов  массива оканчивающихся на 0- "+ summ); //

        System.out.println();
        System.out.println("                Задание 3");

        int vvodChisla1 = scanner.nextInt();
        int vvodChisla2 = scanner.nextInt();
        int[][] massiv2 = new int[vvodChisla1][vvodChisla2];
        int summTotal=0;
        summ = 0;

        for(int i=0; i<massiv2.length; i++){
            for(int j=0; j< massiv2[i].length; j++){                //заполнение массива
                massiv2[i][j] = random.nextInt(0,50);
            }
        }

        for (int i=0; i<massiv2.length; i++){
            for(int j=0; j<massiv2[i].length;j++){
                System.out.print(massiv2[i][j] + " ");   //вывод на экран массива
            }
            System.out.println();
        }

        for (int i=0; i<massiv2.length; i++){
            for(int j=0; j<massiv2[i].length;j++){
                summ = massiv2[i][j] + summ;
                }
                 System.out.print(summ);
                 System.out.println();

                         if(summTotal<summ){
                      counter=i;
                      summTotal=summ;
                       }
                summ=0;
             }
        System.out.println("Самая большая строка "+ summTotal);
        System.out.println("Индекс строки "+ counter);


        //////////////////////////Задание 4///////////////////////
        System.out.println();
        System.out.println("              Задание 4");
        vvodChisla=scanner.nextInt();
        int summ2 = 0;
        int sumMax=0;
        counter=0;
        int[] massiv3 =new int[vvodChisla];
        int minus =vvodChisla-2;
        for(int i=0; i< massiv3.length; i++ ){
            massiv3[i] =random.nextInt(0,10000);     //Присвоение массиву значений
        }

        for (int x:massiv3) {
            System.out.print(x + " ");      //Вывод массива в строку

        }
        System.out.print(" Значения массива");

        System.out.println();
        System.out.println();
        for(int i=0; i< massiv3.length; i++ ){
            if(i<minus){
             summ2=massiv3[i]+massiv3[i+1]+massiv3[i+2];   //Цикл суммирующий значения
            System.out.print(summ2 +" ");                   //И выводящий суммы трех чисел
            if(summ2>sumMax){
                sumMax=summ2;
                counter=i;
            }
            }

        }
        System.out.print(" Значения сумм массива");
        System.out.println();
        System.out.println();
        System.out.println(sumMax + " -Максимальная сумма");
        System.out.println(counter + " -Индекс первого элемента");
    }
}
