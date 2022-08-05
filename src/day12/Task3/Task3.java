package src.day12.Task3;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args){


        List<MusicBand> list = new ArrayList<>();
        List<MusicBand> list2 = new ArrayList<>(); //empty

        list.add(new MusicBand("Ramstain", 1977));
        list.add(new MusicBand("Ivanushki", 2003));
        list.add(new MusicBand("HiFi", 1970));
        list.add(new MusicBand("Pugacheva", 1990));
        list.add(new MusicBand("Sash", 1999));
        list.add(new MusicBand("Nana", 1985));
        list.add(new MusicBand("Blue", 2010));
        list.add(new MusicBand("RedBad", 2021));
        list.add(new MusicBand("SlapHat", 2022));
        list.add(new MusicBand("BonnyM", 1960));

        System.out.println("печать оригинального списка");
        System.out.println(list); //печать оригинального списка

        System.out.println("\nпечать смешанного списка");
        mixMusicBand(list); //Вызов метода смешивания
        System.out.println(list);

        System.out.println("");
        groupsAfter2000(list2,list);   //Вызов метода с исполнителями после 2000-х



    }

  public static void mixMusicBand(List<MusicBand> list){
        Collections.shuffle(list);
  }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands, List<MusicBand> bands2){
        bands.addAll(bands2);
        for(int i=0; i < bands.size(); i++){
            if(bands.get(i).getYear()>2000){

                System.out.println(bands2.get(i).getName() +" " + bands2.get(i).getYear());

            }
        }
        return bands2;
    }

}
