package src.day6;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.info();
        car.setModel("Tayota");
        car.setColor("Brown");
        car.setYear(2002);
        System.out.println("Модель машины - " + car.getModel());
        System.out.println("Цвет машины - " + car.getColor());
        System.out.println("Год машины - " + car.getYear());
        System.out.println(car.YearDifferency(2022));

        System.out.println();
        Motorbike motorbike = new Motorbike("Yamaha","Red", 2000);
        motorbike.info();
        System.out.println("Модель мотоцикла " +motorbike.getModel());
        System.out.println("Цвет мотоцикла " +motorbike.getColor());
        System.out.println("Год мотоцикла " +motorbike.getYear());
        System.out.println(motorbike.yearDifference(2021));
     }
}
