package inheritance;

public class Shop {
    String name;
    String description;
    String price;
    public Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
