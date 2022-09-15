package src.day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    static int counter;
    public static void main(String[] args){
        HashMap<Integer, Point> hashMap= new HashMap<>();
        Scanner scanner2 = new Scanner(System.in);
        String separator = File.separator;
        String path = "C:" +separator+"Lessons"+ separator+"untitled"+separator +"src"+ separator+"resources"+ separator+"taxi_cars.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] massiv = line.split(" ");
                int key = Integer.parseInt(massiv[0]);
                int value1 = Integer.parseInt(massiv[1]);
                int value2 = Integer.parseInt(massiv[2]);
                hashMap.put(key, new Point(value1, value2));
            }
            int f=0;
            int s=0;
            System.out.println("Введите x1");
            int x1 =scanner2.nextInt();
            System.out.println("Введите y1");
            int y1 =scanner2.nextInt();
            System.out.println("Введите x2");
            int x2 =scanner2.nextInt();
            System.out.println("Введите y2");
            int y2 =scanner2.nextInt();

            for(Map.Entry<Integer, Point> x: hashMap.entrySet()){
                if(x.getValue().x==x1 && x.getValue().y==y1){
                    f =x.getKey();
                    counter=++f;
                    System.out.println(counter + " Начало");
                }

                if(x.getValue().x!=x2 && x.getValue().y!=y2){
                    counter++;


                } else if(x.getValue().x==x2 && x.getValue().y==y2){
                    s =x.getKey()-1;
                    System.out.println(s + " Конец");
                    System.out.println((s+1)-f + " Общее количество внутри квадрата");
                    break;
                }
            }


            for (int i=f; i<=s; i++){
                System.out.println(i + " Внутри квадрата");
            }

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
