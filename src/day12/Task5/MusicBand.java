package src.day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusecArtist> members;

    public MusicBand(String name, int year, List<MusecArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public void setMembers0(List<MusecArtist> members) {
        this.members = members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }



    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void printMembers(List<MusecArtist> members1) {
               System.out.println(members1);
    }

    public void getMembers(List<MusecArtist> members) {
        return;
    }

    public static List<MusecArtist> transferMembers(List<MusecArtist> members1, List<MusecArtist> members2){
       members1.addAll(members2);
       members2.clear();

        return members1;
    }
}
