package src.day9;

public class Triangle extends Figure{
  private double dlinaA, dlinaB, dlinaC;


  public Triangle(String color, double dlinaA, double dlinaB, double dlinaC){
    super(color);
    this.dlinaA = dlinaA;
    this.dlinaB = dlinaB;
    this.dlinaC = dlinaC;
  }

  @Override
  public double area(){
    //По формуле Герона
    double p = ((dlinaA+dlinaB+dlinaC)/2);     //  Определяем полупериметр треугольника
    p = (p*(p-dlinaA)*(p-dlinaB)*(p-dlinaC)); //   Определяемплощадь треугольника под корнем
    p = Math.sqrt(p);       //Выводим из под корня
    return p;
  }

  @Override
  public double perimetr(){
    return (dlinaA+dlinaB+dlinaC);
  }

}
