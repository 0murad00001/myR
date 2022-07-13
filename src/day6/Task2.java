package src.day6;

public class Task2 {
    public static void main(String[] args){
        System.out.println();
        Airplane airplane = new Airplane("Boing", 1980, 30, 15000,0 );
        airplane.info();
        airplane.setYear(1982);
        airplane.setLength(32);
        airplane.fillUp(40);
        airplane.fillUp(-18);
        airplane.info();
    }
}
