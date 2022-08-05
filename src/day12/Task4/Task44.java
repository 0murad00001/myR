package src.day12.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Агнета Фельтског");
        members1.add("Берн Ульвеус");
        members1.add("Бенни Андерсон");
        members1.add("Анна Фрида");
        MusicBand musicBand1 = new MusicBand("ABBA", 1971, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Курт Кобейн");
        members2.add("Крист Новоселич");
        members2.add("Дэйв Грол");
        MusicBand musicBand2 = new MusicBand("Нирвана", 1976, members2);

        musicBand2.printMembers();

        System.out.println(members1);
        System.out.println(musicBand1);

        System.out.println(members2);
        System.out.println(musicBand2);



        add(members2);      //вызов метода добавления нового участника
        System.out.println();
        System.out.println(musicBand2);

      /*  for (int i = 0; i < members2.size(); i++) {
            members1.add(members2.get(i));
        }*/

        members2.clear();






    }
    public static void add(List<String> members2){     //метод добавления нового участника в группу
        Scanner scanner = new Scanner(System.in);
        String add = scanner.nextLine();
        members2.add(add);
    }

    public static void transferMembers(List<String> members1, List<String> members2){     //метод перемещения членов группы из members1 в members2
                members1.addAll(members2);
                members2.clear();
    }


}

