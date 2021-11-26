package TreNhatGiaNhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String ten;
    private Date ns;

    public Person(String ten, String ns) throws ParseException {
        this.ten = ten;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
    }
    @Override
    public String toString(){
        return ten;
    }

    @Override
    public int compareTo(Person o) {
        return ns.compareTo(o.ns);
    }
}
