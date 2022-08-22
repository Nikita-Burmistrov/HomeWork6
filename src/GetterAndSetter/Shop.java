package GetterAndSetter;

public class Shop {
    String fruit;
    private double price;
    static Shop.taste taste;
    public enum taste {sweet,sour,bitter}

    void setPrice(int price){
        this.price=price;
    }

    double getPrice(){
        return this.price;
    }

    public Shop() {

    }

    public Shop(taste taste, String fruit){
        this.taste=taste ;
        this.fruit=fruit;
    }
    void printInfo(){
        System.out.println("fruit: " +this.fruit+ " "+this.taste);
    }
}
