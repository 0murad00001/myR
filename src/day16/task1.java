package src.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task1 {

    public static void printResult(){
        String separator = File.separator;
        File file = new File("C:"+separator+"Lessons"+separator+"untitled"+separator+"src"+separator+"day14"+separator+"test.txt");
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){

                String line = scanner.nextLine();
                String[] massiv = line.split(" ");
                double summ=0;
                for(int i=0; i<massiv.length; i++){
                    double x =Double.parseDouble(massiv[i]);
                    summ +=x;
                }
                summ = summ/massiv.length;
                System.out.println(summ);
                System.out.print(String.format("%.3f",summ));
            }
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл");
        }
    }


    public static void main(String[] args){
printResult();
    }
}
