package inheritance;

import java.util.ArrayList;
import java.util.Objects;

public class Restaurant implements Reviewable{
    private String name;
    private double stars;
    private String price;
    ArrayList<Review> reviews = new ArrayList<>();
    public Restaurant(String name, String price){
        this.name = name;
        this.price = price;
        stars = 0;
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

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void addReview(Review review){
        if(!reviews.contains(review)){
            reviews.add(review);
            stars = getAverageStarsRating();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Double.compare(that.stars, stars) == 0 && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(reviews, that.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stars, price, reviews);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                ", reviews: " + reviews +
                "}";
    }
}
