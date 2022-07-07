package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Lesson4 {
    public static void main(String[] args) {
        /////////////////////////////////Задание 1/////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
  /*         int counter = scanner.nextInt();
        int[] numbers = new int[counter];


        for(int i=0; i<numbers.length; i++){
            numbers[i]=rand.nextInt(10);
            System.out.print(numbers[i]);
        }
int count = 0;
int count2 =0;
int count3= 0;
int count4= 0;
int count5= 0;
        System.out.println();

        for(int each:numbers){      //цикл вытаскивает количество чисел более 8
            if(each>8){
                count = count + 1;
            } else {
                continue;
            }
        }

        for (int each:numbers){          //цикл вытаскивает количество чисел равных1
            if(each==1){
                count2 = count2 + 1;
            } else {
                continue;
            }
        }

        for(int each:numbers){      //количество четных чисел
            if(each%2 ==0){
                count3=count3 + 1;
            }else {
                continue;
            }
        }

        for(int each:numbers){         //количество нечетных чисел
            if(each%2 ==1){
                count4=count4 + 1;
            }else {
                continue;
            }
        }

        for(int each:numbers){         //Сумма всех элементов массива

                count5=each+count5;

        }



        System.out.println(" Количество чисел больше восьми: " + count);
        System.out.println(" Количество чисел равных одному: " + count2);
        System.out.println(" Количество четных чисел: " + count3);
        System.out.println(" Количество нечетных чисел: " + count4);
        System.out.println(" Сумма всех элементов массива: " + count5);
*/
//////////////////////////////Задание 2//////////////////////////////
  /*      int z = scanner.nextInt();
        int[] massiv = new int[z];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(0, 10000);
            System.out.println(massiv[i]);
        }

        int max = 0;
        int min = 10000;
        for (int d : massiv) {
            if (max < d) {
                max = d;
            }
        }

        for (int d : massiv) {
            if (min > d) {
                min = d;
            }
        }
////////////////Задание 3/////////////////////////
        int cheti =0;
        int[] massiv0= new int[massiv.length];

        for (int i= 0; i<massiv.length; i++){
            if(massiv[i]%10==0){
                massiv0[i]=massiv[i];
                System.out.println(massiv0[i] + "Проверка массива");
                cheti= cheti+1;
            }
        }


///////////////////Задание 4////////////////////////////////
        int cheti2 =0;
        int[] massiv1= new int[massiv.length];

        for (int i= 0; i<massiv.length; i++){
            if(massiv[i]%10==0){
                massiv1[i]=massiv[i];
                //System.out.println(massiv0[i] + "Проверка массива");
                cheti2= massiv1[i]+cheti2;
            }
        }
  /////////////////////////////////////////////////////////////
        System.out.println("Cумму элементов массива, оканчивающихся на 0 -" +cheti2);
        System.out.println("Количество элементов массива, оканчивающихся на 0 -" +cheti);
        System.out.println("Самое большое число " + max);
        System.out.println("Самое меньшее число " + min);

*/
        //////////////////Задание 3/////////////////////////////
   /*     Scanner scanner2 = new Scanner(System.in);
        int varb = scanner2.nextInt();
        int varb2 = scanner2.nextInt();
        int[][] massiv3 = new int[varb][varb2];
        int[] massiv4= new int[massiv3.length];

        int xv = 0;
        int xn = 0;
        int stroka=0;
        int maxIndex=0;
        for (int i = 0; i<massiv3.length; i++){
            massiv3[i][0] = rand.nextInt(0,50); //тут происходит создание и присвоение значений строкам массива

            for(int j =0; j<massiv3[i].length; j++){
                massiv3[i][j] = rand.nextInt(0,50); //тут создание и присвоение столбцам массива
                System.out.print(massiv3[i][j] +" ");
                               }
            System.out.println();
        }
        System.out.println();

        for(int i =0; i< massiv3.length; i++){
            for (int j =0; j<massiv3[i].length; j++){     //цикл который выводит индекс строки в которой максимальная сумма
                xv = massiv3[i][j]+xv; // тут высчитывает сумма строки

            }

            System.out.print(xv);
            System.out.println();

            if(xn<xv){
                maxIndex = i;
                xn=xv;
                            }


            xv =0;

        }
        System.out.println();
        System.out.println("Самая большая строка "+ xn);
        System.out.println("индекс строки "+ maxIndex);
*/


        //////////////////////Задание4////////////////////////
        Scanner scann = new Scanner(System.in);
        int qwe = scann.nextInt();
        int qwe2 = qwe-2;
        int[] massiv5 = new int[qwe];
        int summa;
        int summa2 =0;
        int summa3 =0;
        int summa5 =0;
        for (int i=0; i<massiv5.length; i++){
            massiv5[i] = rand.nextInt(0,10000);

            System.out.println(massiv5[i]);


        }
        System.out.println();
        System.out.println();


        //теперь воспользовавшись заполненным массивом
        for(int i=0; i<massiv5.length; i++) {
            if(i<qwe2){ //Вот это выражение мне не по душе как то, если при включении сканера задать не 100 а к примеру 90 программа сыпется, из за данного выражения
                summa = massiv5[i]+massiv5[i+1]+massiv5[i+2];
                if(summa>summa3){
                    summa3=summa;
                    summa2= i;
                }

            }else break;

            System.out.println(summa);

        }
        System.out.println(summa2);


    }
}
