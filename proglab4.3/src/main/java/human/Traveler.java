package human;

import devices.Products;

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
            Object sw = lis[i];
            if (Math.random() < cur){
                looked++;
                System.out.println("wow " + sw );
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
            System.out.println(name + " чекнул " + f);
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
}
