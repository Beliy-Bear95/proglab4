package parts;

import human.Citizen;

import java.util.Objects;

public class Nose {
    public Nose(){

    }
    public void Fire(Object tr){
        Citizen f = (Citizen) tr;
        if (Math.random() < f.clumsiness){
                System.out.println("Iron is stopped. Dress saved.");
            }
    }
}
