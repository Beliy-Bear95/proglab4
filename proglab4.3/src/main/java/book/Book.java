package book;


import devices.Products;

import java.util.Objects;

public class Book extends Products {
    public int size;
    public Book(String name, int damage, int size){
        super(name, damage);
        this.size = size;
    }
    @Override
    public boolean equals(Object obj) {
        Book s = (Book) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.name == s.name && this.damage == s.damage && this.size == s.size){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, damage, size);
    }

    @Override
    public String toString() {
        System.out.println(String.format(name));
        return String.format(name);
    }
}
