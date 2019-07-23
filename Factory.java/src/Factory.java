import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Car obj1 = new Car();
        System.out.println("Enter the number of screws needed: ");
        obj1.getScrews();
        System.out.println("Enter the number of Nails required: ");
        obj1.getNails();
        System.out.println("Enter the number of Nuts required: ");
        obj1.getNuts();
        System.out.println("Enter the number of bolts required: ");
        obj1.getBolts();
        System.out.println("Enter the number of Engines required:  ");
        obj1.getEngine();

        Lorry  obj2=new Lorry();
        System.out.println("Enter the number of screws needed: ");
        obj2.getScrews();
        System.out.println("Enter the number of Nails required: ");
        obj2.getNails();
        System.out.println("Enter the number of Nuts required: ");
        obj2.getNuts();
        System.out.println("Enter the number of bolts required: ");
        obj2.getBolts();
        System.out.println("Enter the number of Engines required:  ");
        obj2.getEngine();

        Tempo obj3=new Tempo();
        System.out.println("Enter the number of screws needed: ");
        obj3.getScrews();
        System.out.println("Enter the number of Nails required: ");
        obj3.getNails();
        System.out.println("Enter the number of Nuts required: ");
        obj3.getNuts();
        System.out.println("Enter the number of bolts required: ");
        obj3.getBolts();
        System.out.println("Enter the number of Engines required:  ");
        obj3.getEngine();
    }


}
abstract class rawmaterials{
    int Screws,Nails,Nuts,Bolts,Engine;

    public int getScrews() {
        return Screws;
    }

    public void setScrews(int screws) {
        Screws = screws;
    }

    public int getNails() {
        return Nails;
    }

    public void setNails(int nails)
    {
        Nails = nails;
    }

    public int getNuts() {
        return Nuts;
    }

    public void setNuts(int nuts)
    {
        Nuts = nuts;
    }

    public int getBolts() {
        return Bolts;
    }

    public void setBolts(int bolts)
    {
        Bolts = bolts;
    }

    public int getEngine() {
        return Engine;
    }

    public void setEngine(int engine) {
        Engine = engine;
    }
    public void manufacturing(){
        System.out.println("Manufacturing a vehicle.");
    }
}
class Car extends rawmaterials{
    @Override
    public void manufacturing() {
        System.out.print("Manufacturing  a Car");
    }
}
class Lorry extends rawmaterials {
    @Override
    public void manufacturing() {
        System.out.print("Manufacturing  a Lorry");
    }
}
class Tempo extends rawmaterials {
    @Override
    public void manufacturing() {
        System.out.print("Manufacturing  a Tempo");
    }
}