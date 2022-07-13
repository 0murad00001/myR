package src;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        ////////////////////////////Задание1/////////////////////////
        Car car = new Car();
        System.out.println("              Задание 1");
        car.setModel("Mersedes-Bens");
        car.setColor("Black");
        car.setYear(1986);
        System.out.println("Модель автомобиля- " + car.getModel());
        System.out.println("Цвет автомобиля- " + car.getColor());
        System.out.println("Модель автомобиля- " + car.getYear());

        System.out.println();
        System.out.println("              Задание 2");
        Motorbike motorbike = new Motorbike("BMW","Yellow", 2022);
        System.out.println("Модель мотоцикла- " + motorbike.getModel());
        System.out.println("Цвет мотоцикла- " + motorbike.getColor());
        System.out.println("Год мотоцикла- " + motorbike.getYear());
    }
}

class Car{
   private String model;
   private String color;
   private int year;

   public void setModel(String model){
       this.model = model;}
   public String getModel(){
       return this.model;}


    public void setColor(String color) {
        this.color = color;}
    public String getColor(){
       return this.color;}

    public void setYear(int year){
       this.year = year;}
    public int getYear(){
       return  this.year;}
}



class Motorbike{
   private String model;
   private String color;
   private int year;

    public Motorbike(String model, String color, int year){
        this.model= model;
        this.color = color;
        this.year = year;
   }

   public String getModel(){
        return model;
   }
   public String getColor(){
        return color;
   }
   public int getYear(){
        return year;
   }
}

