package src.day7;

class Airplane {
  private String manufacturer;
  private int year;
  private int length;
  private int weight;
  private int fuel;

  public Airplane(String manufacturer, int year, int length, int weight, int fuel){
      this.manufacturer = manufacturer;
      this.year =year;
      this.length = length;
      this.weight =weight;
  }

  public void info(){
      System.out.println("Изготовитель: "+ manufacturer+ " , год выпуска: "+ year + " , длина: "+ length+  " , вес: "+weight+  " , количество топлива в баке: "+ fuel);
  }

    public int fillUp(int n){
      fuel=n+fuel;
      return fuel;
    }

  public void setManufacturer(String manufacturer){
      this.manufacturer =manufacturer;
  }
  public void setYear(int year){
      this.year = year;
  }
  public void setLength(int length){
      this.length = length;
  }
  public void setWeight(int weight){
      this.weight = weight;
  }
  public void setFuel(int fuel){
      this.fuel= fuel;
  }

  int getFuel(int fuel){
      return fuel;
  }
  String getName(String name){return name;}

    void compareAirplanes(Airplane airplane, Airplane airplane2){
        if(airplane.length> airplane2.length){
            System.out.println("Самолет1 "+ airplane.manufacturer + " Длинее самолета "+ airplane2.manufacturer );
        } else {
            System.out.println("Самолет2 "+ airplane2.manufacturer + " Длинее самолета "+ airplane.manufacturer );
        }

    }



}
