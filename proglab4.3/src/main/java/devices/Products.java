package devices;

import human.Citizen;

import java.util.Objects;

public class Products {
    public String name;
    public int damage;
    public Products(String name, int damage){
        this. name = name;
        this.damage = damage;
    }
    public boolean broke(Object e){
        Products g = (Products) e;
        if (damage > 0){
            System.out.println(g.name +" сломан");
        }
        return (damage > 0);
}
    @Override
    public boolean equals(Object obj) {
        Products s = (Products) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.name == s.name && this.damage == s.damage){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, damage);
    }

    @Override
    public String toString() {
        System.out.println(String.format(name));
        return String.format(name);
    }
}
