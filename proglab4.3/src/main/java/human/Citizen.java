package human;

import devices.DressException;
import devices.Iron;

import java.util.Objects;

public class Citizen extends Shortie{

    public Citizen(String name, int age, double clumsiness){
        super(name, age, clumsiness);
    }
    
    public int command(Object[] tr){
        int n = tr.length;
        int it = 1;
        for (int i =  0; i <= n-1; i++){
            Traveler f = (Traveler) tr[i];
            if (f.looked < 3){
                it = 0;
                break;
            } 
            else{
                continue;
            }
        }
        if (it == 1){
            for (int d = 0; d <= n-1; d++){
                Traveler r = (Traveler) tr[d];
                r.looked = 0;
            }
        }
        return it;
    }

    @Override
    public void look(Object[] list){
        Object[] lis = list;
        int n = lis.length;
        for (int i = 0; i <= n; i++){
            Object f = lis[i];
            System.out.println("это " + f);
        }

    }
    public void people(Object[] list){
        if (list.length > 2){
            System.out.println("Людишки...");
        }
    }
    
    public void used(Object w, Object[] lisk) throws DressException {
        Iron k = (Iron) w;
        System.out.println("Смотрите какой утюг. Проверю, есть ли Dress");
        k.usei(lisk, this);
        
    }

    @Override
    public boolean equals(Object obj) {
        Citizen s = (Citizen) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.name == s.name && this.age == s.age && this.clumsiness == s.clumsiness){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age, clumsiness);
    }
    
    @Override
    public String toString() {
        System.out.println(String.format(name));
        return String.format(name);
    }
}

