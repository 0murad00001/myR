package src.day19.task2;

import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Task2 {
    //1
    static Map<Integer, Point> map = new HashMap<>();
    static Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args) {

        String separator = File.separator;

        File file = new File("C:" + separator + "taxi_cars.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                String[] massiv = word.split(" ");
                int key = Integer.parseInt(massiv[0]);
                int value1 = Integer.parseInt(massiv[1]);
                int value2 = Integer.parseInt(massiv[2]);
                map.put(key, new Point(value1, value2));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        int counter = 0; //переменная -счетчик для подсчета общего количества машин в квадрате
        int x = FirstCoordinate(); //вытаскиваем первую машину и присваем
        int y = SecondCoordinate(); //последнюю машину

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            if (entry.getKey() > x && entry.getKey() < y) {
                counter++;
                System.out.println("Внутри квадрата машина № " + entry.getKey()); //выводим машины которые внутри квадрата
            }
        }
        System.out.println("Общее количество машин в квадрате = " + counter); //выводим общее колчество машин

    }

    public static int FirstCoordinate() { //Задает координаты первой машины и возвращает ее id
        System.out.println("Введите x1");
        int x1 = scanner2.nextInt();
        System.out.println("Введите y1");
        int y1 = scanner2.nextInt();

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            if (entry.getValue().getX() == x1 && entry.getValue().getY() == y1) {
                int firstCar = entry.getKey();
                return firstCar;
            }
        }
        return 0;
    }

    public static int SecondCoordinate() { //Задает координаты второй машины и возвращает ее id
        System.out.println("Введите x2");
        int x2 = scanner2.nextInt();
        System.out.println("Введите y2");
        int y2 = scanner2.nextInt();

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            if (entry.getValue().getX() == x2 && entry.getValue().getY() == y2) {
                int lastCar = entry.getKey();
                return lastCar;
            }
        }
        return 0;
    }

}
