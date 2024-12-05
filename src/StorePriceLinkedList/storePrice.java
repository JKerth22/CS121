package StorePriceLinkedList;

import java.util.LinkedList;

public class storePrice {
    String name;
    String description;
    double price;
    LinkedList<String> similarItems = new LinkedList<String>();
    public storePrice(String n, String d, double p){
        this.name = n;
        this.description = d;
        this.price = p;
    }
    public void addEntry(String e){
        similarItems.add(e);
    }
    public void removeEntry(){
        if (!similarItems.isEmpty()){
            similarItems.removeFirst();
        }
    }
    public void getInfo(){
        System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: " + price);
    }
    public void displayEntries(){
        for (int i = 0; i < similarItems.size(); i++){
            System.out.println(similarItems.get(i));
        }
    }

    public static void main(String[] args) {
        storePrice soapBar = new storePrice("Soap Bar", "Individual Cleaning Item", 5.50);
        soapBar.similarItems.add("Shampoo");
        soapBar.similarItems.add("Conditioner");
        soapBar.similarItems.add("Foam Soap");
        soapBar.getInfo();
        soapBar.removeEntry();
        soapBar.displayEntries();
        storePrice mop = new storePrice("Mop", "Household Cleaning Item", 12.99);
        mop.similarItems.add("Swiffer");
        mop.similarItems.add("Vacuum");
        mop.similarItems.add("Towel");
        mop.getInfo();
        mop.removeEntry();
        mop.displayEntries();
    }
}

