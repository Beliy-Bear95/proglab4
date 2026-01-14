package prog;
import consumables.Consumables;
import devices.*;
import fabrics.Fabrics;
import human.*;
import book.*;


public class prog4{
public static void main(String[] args) throws DressException{
    Citizen citizen = new Citizen("Klepka", 28, 0.2);
    Citizen citz = new Citizen("Klepka", 23, 0.2);
    Traveler traveler1 = new Traveler("xyz", 45, 0.4, 0, 0.7);
    Traveler traveler2 = new Traveler("wed", 43, 0.3, 0, 0.5);
    Traveler traveler3 = new Traveler("pepe", 48, 0.2, 0, 0.6);

    Object[] trvl = {traveler1, traveler2, traveler3};
    Object[] ctzn = {citz, citizen};
    int cz = ctzn.length;

    Iron iron = new Iron("iron",0);
    Products juice = new Products("Juicer", 0);
    Products sweeper = new Products("swipe", 0);
    Products washmachine = new Products("Washcar", 0);
    Products pot = new Products("potter", 0);
    Products vacclean = new Products("vacuum", 0);
    Products wiper = new Products("viperr", 0);

    Object[] Devc= {iron, juice, pot, sweeper, washmachine, vacclean, wiper};

    Book b1 = new Book("warandpeace1", 0, 8);
    Book b2 = new Book("MyHeroAcademia", 0, 7);
    Book b3 = new Book("1984", 0, 5);
    Object[] lib = {b1, b2, b3};

    Object[] cons = Consumables.values();
    
    Visitors vs = new Visitors("jack");
    Visitors vs1 = new Visitors("kratos");
    Visitors vs2 = new Visitors("son");
    Object[] vis = {vs, vs1, vs2}; 

    Fabrics devicefab = new Fabrics("xyz", "lenina33", Devc);
    Fabrics bbfab = new Fabrics("readbro", "pushkina99", lib);


    citizen.toString();

    System.out.println("Путешественники: " + traveler1.name + ", " + traveler2.name + ", " + traveler3.name + " ждут пока придет " + citizen.name);
    for (int d = 0; d <= cz; d++){
        Object as = ctzn[d];
        System.out.println("Кто-то подходит. Назови себя");
        as.toString();
        if (citizen.equals(as) && citizen.hashCode() == as.hashCode()){
        System.out.println("- Это наш бро. Вся информация совпала. Это " + citizen.name);
        break;
    }
    else{
        System.out.println("- Информация не совпала. Это не наш бро, ждём дальше");
    }
    }

System.out.println("Идем в первую фабрику:" + devicefab.name);


citizen.used(iron, cons);
System.out.println("Смотрите всё остальное");
while (citizen.command(trvl) == 0){
if (Math.random() < traveler1.cur){
    traveler1.Check(devicefab.list);
}
else{
    traveler1.look(devicefab.list);
}
if (Math.random() < traveler2.cur){
    traveler2.Check(devicefab.list);
}
else{
    traveler2.look(devicefab.list);
}
if (Math.random() < traveler3.cur){
    traveler3.Check(devicefab.list);
}
else{
    traveler3.look(devicefab.list);
}
}
System.out.println("Идем на следующую фабрику: " + bbfab.name);
citizen.people(vis);
while (citizen.command(trvl) == 0){
if (Math.random() < traveler1.cur){
    traveler1.Check(bbfab.list);
}
else{
    traveler1.look(bbfab.list);
}
if (Math.random() < traveler2.cur){
    traveler2.Check(bbfab.list);
}
else{
    traveler2.look(bbfab.list);
}
if (Math.random() < traveler3.cur){
    traveler3.Check(bbfab.list);
}
else{
    traveler3.look(bbfab.list);
}
}
System.out.println("Конец ребята");
 


}
}
