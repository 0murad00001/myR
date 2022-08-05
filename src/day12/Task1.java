package src.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("BMW");
        list.add("KiA");
        list.add("Lada");
        list.add("Lexus");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add(2, "Lamborgini");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

}
