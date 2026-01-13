package devices;

import consumables.Consumables;
import parts.Eyes;
import parts.Nose;

public class Iron extends Devices{
    public Iron(int damage){
        super(damage);
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
}
