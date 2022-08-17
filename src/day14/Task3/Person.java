package src.day14.Task3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year ){
       this.name = name;
       this.year = year;
    }

    static List<Person> parseFileToObjList(File file){
        int count =0;
        String line ="";

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Некорректный входной файл");
        }
        List<Person> list = new ArrayList<>();

        while(scanner.hasNext()){
            line += scanner.nextLine() + " ";
            count++;
        }

        String [] line2 = new String[count];
        line2= line.split(" ");
        System.out.println(Arrays.toString(line2));

        for(int i=1; i<line2.length; i=i+2){      //этот цикл For перебирает числа в массиве и
            int number = Integer.parseInt(line2[i]);

            if(number<0){ //и если значение меньше 0 - почистить лист и ничего не вернуть
                System.out.println("Некорректный входной файл");
                return list = null;
            }
        }
        for (int j=0; j< line2.length; j+=2){
            int in = Integer.parseInt (line2[j+1]); //преобразем каждый второй элемент массива - строки в цифры
            list.add(new Person(line2[j], in));// добавляем в лист, две переменные -строки и числа
        }
        System.out.println(list); //выводим на экран лист

        return list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("src" + separator + "day14" + separator + "Task2" + separator + "people.txt");
        parseFileToObjList(file);
    }
}
