package src.day9;

public abstract class Figure {
    String color;
    public Figure(String color){
        this.color = color;
    }
    public String getColor(){
        return getColor();
    }

    public abstract double area();
    public abstract double perimetr();

}
