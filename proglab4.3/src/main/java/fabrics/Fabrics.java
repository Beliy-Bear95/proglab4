package fabrics;

import human.Citizen;

import java.util.Objects;

public class Fabrics{
    public String name;
    String place;
    public Object[] list;
    public Fabrics(String name, String place, Object[] list){
        this.name = name;
        this.place = place;
        this.list = list;
    }
    @Override
    public boolean equals(Object obj) {
        Fabrics s = (Fabrics) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.name == s.name && this.place == s.place && this.list == s.list){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, place, list);
    }

    @Override
    public String toString() {
        System.out.println(String.format(name));
        return String.format(name);
    }
}