
package be.condorcet.demo1.model;

public class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean canBeBoughtwith(int rubies) {
        return rubies >= price;
    }
}
