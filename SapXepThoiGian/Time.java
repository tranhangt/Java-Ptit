package SapXepThoiGian;

public class Time implements Comparable<Time> {
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(Time o) {
        if(gio < o.gio) return -1;
        if(gio == o.gio && phut < o.phut) return -1;
        if(gio == o.gio && phut == o.phut && giay < o.giay) return -1;
        return 1;
    }

    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
}
