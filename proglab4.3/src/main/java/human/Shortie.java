package human;

import java.util.Objects;

public abstract class Shortie {
    public final String name;
    public final int age;
    public final double clumsiness;

    public Shortie(String name, int age, double clumsiness){
        this.name = name;
        this.age = age;
        this.clumsiness = clumsiness;
    }
    public abstract void look(Object[] list);

}