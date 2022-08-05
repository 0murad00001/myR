package src.day12.Task5;

public class MusecArtist {
    private String name;
    private int year;

    public MusecArtist(String name, int year) {
        this.name = name;
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
        return "MusecArtist{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
