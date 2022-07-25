package src.day9;

public class Circle extends Figure{
    private double radiusOkrugnisti;

    public Circle(String color, double radiusOkrugnisti){
        super(color);
        this.radiusOkrugnisti = radiusOkrugnisti;
    }
    @Override
    public double area(){
        return (radiusOkrugnisti* Math.PI);
    }

    @Override
    public double perimetr() {
        return (2* Math.PI * radiusOkrugnisti);
    }
}
