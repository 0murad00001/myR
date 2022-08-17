package src.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // вытащили сепаратор системы
        String path ="C:"+separator+"Lessons"+separator+"untitled"+separator+"src"+separator+"day14"+separator+"test.txt";

        File file = new File(path); //создали ссылочную переменную file по типу класса File
        printSumDigits(file); //вызвали наш метод и передали ему аргумент filw
       // System.out.println(separator); //посмотрели какой у нас сепаратор
    }

    static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file); // считали файл
        String line = scanner.nextLine(); //считали сканером строки в файле
        String[] numbersString = line.split(" "); //делим строку на части по эменту пробел и записываем в стринговый массив
        System.out.println(Arrays.toString(numbersString)+ " количество чисел в массиве");
        if(numbersString.length !=10){ //если количество чисел в массиве не равно 10
            System.out.println("Некорректный входной файл");
            return;
        }
        int[] number = new int[10]; //создаем интовый массив из 10 значений

        int sum=0;
        for(int i =0; i< number.length; i++){
            number[i] = Integer.parseInt(numbersString[i]); // присваиваем int массиву number = преобразованный из стринг в инт массив numbersString
            sum += number[i]; //суммируем значения массива number
        }
        System.out.println();
        System.out.println( "Сумма вчех чисел = " +sum);
    }
}
