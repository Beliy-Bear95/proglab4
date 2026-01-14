package human;

import devices.Products;

import java.util.Objects;

public class Traveler extends Shortie implements Checkable{
    public int looked;
    public double cur;
    public Traveler(String name, int age, double clumsiness, int looked, double cur){
        super(name, age, clumsiness);
        this.looked = looked;
        this.cur = cur;
    }
    @Override
    public void look(Object[] list){
        Object[] lis = list;
        int n = lis.length;
        for (int i = 0; i <= n-1; i++){
            Products sw = (Products) lis[i];
            if (Math.random() < cur){
                looked++;
                System.out.println(name + ": wow " + sw.name);
            }
            else{
                continue;
            }
        }

    }
    @Override
    public void Check(Object[] list){
        Object[] lis = list;
        int n = lis.length;
        for (int i = 0; i <= n-1; i++){
            Products f = (Products) lis[i];
            System.out.println(name + " чекнул " + f.name);
            looked++;
            if (f.broke(f)){
                continue;
            }
            else {
                if (Math.random() < clumsiness){
                f.damage++;
                }
            }
            
        }
    }
    @Override
    public boolean equals(Object obj) {
        Traveler s = (Traveler) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.name == s.name && this.age == s.age && this.clumsiness == s.clumsiness && this.looked == s.looked && this.cur == s.cur){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, clumsiness, looked, cur);
    }

    @Override
    public String toString() {
        System.out.println(String.format(name));
        return String.format(name);
    }
}
