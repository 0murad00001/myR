package src.day6;

class Car {
   private String model;
   private String color;
   private int year;          //год выпуска транспортного средства
   private int inputYear;


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

    public void info(){
        System.out.println("Это автомобиль");}

    public int YearDifferency(int inputYear){
       this.inputYear = inputYear;

       inputYear= inputYear-year;
        return  inputYear;
        }
     }




