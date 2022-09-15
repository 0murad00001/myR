package src.day19.task2;

public class Point {
    public int x;
    public int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Координата X = "+x+ " Координата Y = "+ y;
    }
}
