package devices;

public abstract class Products {
    public int damage;
    public Products(int damage){
        this.damage = damage;
    }
    public boolean broke(Object e){
        if (damage > 0){
            System.out.println(e +"сломан");
        }
        return (damage > 0);
}
}
