package inheritance;

import java.util.ArrayList;
import java.util.Objects;

public class Shop implements Reviewable{
    String name;
    String description;
    String price;
    private double stars;
    ArrayList<Review> reviews = new ArrayList<>();
    public Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = 0;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", stars="+ this.getStars()+
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", reviews: " + reviews +
                '}';
    }
    private double getAverageStarsRating(){
        double sum = 0;
        for(Review review: reviews)
            sum+=review.getStars();
        return sum/reviews.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public void addReview(Review review) {
        if(!reviews.contains(review)){
            reviews.add(review);
            stars = getAverageStarsRating();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Double.compare(shop.stars, stars) == 0 && Objects.equals(name, shop.name) && Objects.equals(description, shop.description) && Objects.equals(price, shop.price) && Objects.equals(reviews, shop.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, stars, reviews);
    }
}
