package inheritance;

public class Restaurant implements Review{
    private String name;
    private int stars;
    private String price;
    public Restaurant(String name, int stars, String price){
        this.name = name;
        updateStars(stars);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                '}';
    }

    private void updateStars(int stars){
        if(stars > 5)
            this.stars = 5;
        else if(stars < 1)
            this.stars = 1;
        else
            this.stars = stars;
    }

    @Override
    public String addReview(String body, String author, int stars) {
        updateStars(stars);
        return "review:" + body + "\n" +
                "Author:" + author +"\n" +
                "rate: " + stars + " stars";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
