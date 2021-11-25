package ChuViTamGiac;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point o){
        return Math.sqrt((x - o.x) * (x - o.x) + (y - o.y) * (y - o.y));
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public String toString(){
        return x + " " + y;
    }
}
