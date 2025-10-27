package src.scripts.systems.shop;
import java.util.Scanner;


class Product{

    static Scanner sc = new Scanner(System.in);

    private String id;
    private String name;
    private double price;
    private int stock;
    private String description;
    public void restock(int newStock){
        stock = newStock;
    }
    public String getID(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public double getprice(){
        return this.price;
    }
    public int getstock(){
        return this.stock;
    }
    public String getdescription(){
        return this.description;
    }
}
