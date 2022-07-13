package src.day6;


class Motorbike {
   private String model;
   private String color;
   private int year;
   //private  int inputYear;

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

   void info(){
       System.out.println("Это мотоцикл");
   }
    int yearDifference(int inputYear){
       // this.inputYear =inputYear;
        inputYear = inputYear - year;
        return inputYear;
    }
}

