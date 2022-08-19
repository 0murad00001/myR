package src.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shoes {
    final String name;
    final int size;
    final int quantity;
//t5

    public Shoes(String name, int size, int quantity){
        this.name = name;
        this.size = size;
        this.quantity =quantity;
    }

    public static void main(String[] args){
        System.out.println(parseFileToObjList());
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }

    public static List<Shoes> parseFileToObjList(){
        List<Shoes> list = new ArrayList<>();
        String separator = File.separator;
        try {
        File file = new File("C:"+ separator+ "Lessons"+separator+"untitled"+separator+"src"+separator+"resources"+separator+"shoes.txt");
        PrintWriter writeFile = new PrintWriter("C:"+ separator+ "Lessons"+separator+"untitled"+separator+"src"+separator+"resources"+separator+"shoesWrite.txt");  //ОТкрыл поток


            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                  if(line.isEmpty())
                     throw new NullPointerException();

                String[] massiv =line.split(",");
                System.out.println(Arrays.toString(massiv));

                int quantityShoes = Integer.parseInt(massiv[2]);
                int razmerShoes = Integer.parseInt(massiv[1]);
                if(quantityShoes==0){
                    writeFile.println(line);
                }
                list.add(new Shoes(massiv[0],razmerShoes, quantityShoes));
            }
            writeFile.close(); //закрыл поток

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (NullPointerException e){
          System.out.println("Файл пуст");
        }
        return list;
    }
}

