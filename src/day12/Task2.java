package src.day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
        Itterir itterir = new Itterir();
        List<Integer> list= new ArrayList<>();

        itterir.ot0Do30(list);
        System.out.println(list);

    }
}

class Itterir {

    public void ot0Do30(List<Integer> list) {
        for (int i = 0; i < 351; i+=2){
            if(i>30 && i<300) {
                continue;
            }
            list.add(i);
        }
    }
}

