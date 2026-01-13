package parts;

import consumables.Consumables;

public class Eyes {
    public Eyes(){

    }
    public Object choose(Object[] list){
        Object r = null;
        for (int i = 0; i <= list.length-1; i++){
            if (list[i] == Consumables.Dress){
                Object c = list[i];
                r = c;
            }

        
        }
        return r;
    }
}
