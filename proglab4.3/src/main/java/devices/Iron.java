package devices;

import consumables.Consumables;
import parts.Eyes;
import parts.Nose;

import java.util.Objects;

public class Iron extends Products {
    public Iron(String name, int damage){

        super(name, damage);
    }
    Nose no = new Nose();
    Eyes on = new Eyes();

    public void usei(Object[] list, Object cz) throws DressException{
        try {
            if (on.choose(list) == Consumables.Dress){
                no.Fire(cz);
                System.out.println("Всё имеется");
            }
        }catch(Exception e){
            System.out.println(on.choose(list));
            System.out.println("нету dress");
        }

        
    }
    @Override
    public boolean equals(Object obj) {
        Iron s = (Iron) obj;
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
