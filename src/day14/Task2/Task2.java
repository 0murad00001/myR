package src.day14.Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task2 {


    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File("src" + separator + "day14" + separator + "Task2" + separator + "people.txt");
        try {
            parseFileToStringList(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }


    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String[] massiv=new String[4];
        String list1 = "";
        int count =1;


        while(scanner.hasNextLine()){
            String line =  scanner.nextLine();
            list1 += line + " ";
            massiv = list1.split(" ");
            int number = Integer.parseInt(massiv[count]);
            if(number<0){
                System.out.println("Некорректный входной файл");
                return list=null;
            }
            count +=2;
            list.add(new String(line));

        }
        System.out.println(Arrays.toString(massiv) +" это массив");
        System.out.println(list +" Это List");
        return list;
    }
}
