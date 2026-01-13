package book;


import devices.Products;

public class Book extends Products {
    public String name;
    public int size;
    public Book(String name, int size, int damage){
        super(damage);
        this.name = name;
        this.size = size;
    }
    
}
