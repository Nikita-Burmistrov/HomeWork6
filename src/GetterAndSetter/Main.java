package GetterAndSetter;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(Shop.taste.sweet,"Apple");
        shop.printInfo();
        shop.setPrice(15);
        System.out.println(shop.getPrice());
        System.out.println("");

        Shop shop1 = new Shop(Shop.taste.sour,"Orange");
        shop1.printInfo();
        shop1.setPrice(23);
        System.out.println(shop1.getPrice());
        System.out.println("");

        Shop shop2 = new Shop(Shop.taste.sweet,"Grape");
        shop2.printInfo();
        shop2.setPrice(25);
        System.out.println(shop2.getPrice());
        System.out.println("");

        Shop shop3 = new Shop(Shop.taste.bitter,"Pomegranate");
        shop3.printInfo();
        shop3.setPrice(18);
        System.out.println(shop3.getPrice());
        System.out.println("");

        Shop shop4 = new Shop(Shop.taste.sweet,"Banana");
        shop4.printInfo();
        shop4.setPrice(45);
        System.out.println(shop4.getPrice());
        System.out.println("");

    }
}
