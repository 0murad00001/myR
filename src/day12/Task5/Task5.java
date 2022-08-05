package src.day12.Task5;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusecArtist> members1 = new ArrayList<>();
        members1.add(new MusecArtist("Фрау Беладонна", 1));
        members1.add(new MusecArtist("Берн Ульвеус", 2));
        members1.add(new MusecArtist("Бенни Андерсон", 3));
        members1.add(new MusecArtist("Анна Фрида", 4));
        MusicBand musicBand1 = new MusicBand("ABBA", 1971, Arrays.asList(new MusecArtist("Александра Филимонова", 1), new MusecArtist("Майкл Качински", 2)));

        List<MusecArtist> members2 = new ArrayList<>();
        members2.add(new MusecArtist("Курт Кобейн", 5));
        members2.add(new MusecArtist("Крист Новоселич", 6));
        members2.add(new MusecArtist("Дэйв Грол", 7));
        MusicBand musicBand2 = new MusicBand("Нирвана", 1976, Arrays.asList(new MusecArtist("Михаил Кочетков", 21), new MusecArtist("Вахтанг Кикабидзе", 22)));

        MusicBand.transferMembers(members1, members2); //сливаем две группы в одну
       for (MusecArtist mA : members1)
            System.out.println(mA.getName() + " "+  mA.getYear()); //Вывод в группы в консоль после слияния


        System.out.println();
        musicBand2.printMembers(members1); //Вывод на экран


    }
}

