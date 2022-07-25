package src.day9;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("Red", 10, 10, 10),
                            new Triangle("Green", 20, 30, 10),
                            new Triangle("Red", 20, 15, 10),
                             new Rectangle("Red", 10, 5),
                            new Rectangle("Orange", 15, 40),
                            new Circle("Red", 4),
                            new Circle("Red", 10),
                            new Circle("Blue", 5)
        };

TestFigures.calculateRedArea(figures);
TestFigures.calculateRedPerimeter(figures);
    }


   public static double calculateRedArea(Figure[] figures) {
    double area = 0;
    for(int i =0; i< figures.length; i++){
        if(figures[i].color.equals("Red")){
            area += figures[i].area();
        }
    }
    System.out.println("Сумма площадей красных фигур равна - " + area);
    return area;
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double perimetr=0;
        for(int i = 0; i< figures.length; i++){
            if(figures[i].color.equals("Red")){
                perimetr +=figures[i].perimetr();

            }
        }System.out.println("Сумма периметров красных фигур равна - " + perimetr);
        return perimetr;
    }
}
