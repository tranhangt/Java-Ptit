package BonDiemTrenMatPhang;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private Point3D vector(Point3D o){
        return new Point3D(o.x - x, o.y - y,o.z - z);
    }

    private Point3D tichCoHuong(Point3D o){
        return new Point3D(y * o.z - z * o.y, z * o.x - x * o.z, x * o.y - y * o.x);
    }

    private int tichVoHuong(Point3D o){
        return x * o.x + y * o.y + z * o.z;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        Point3D ab = a.vector(b);
        Point3D ac = a.vector(c);
        Point3D ad = a.vector(d);
        if((ab.tichCoHuong(ac)).tichVoHuong(ad) == 0)
            return true;
        return false;
    }
}
