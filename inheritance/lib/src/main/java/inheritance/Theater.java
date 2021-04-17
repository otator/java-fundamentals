package inheritance;

import java.util.ArrayList;
import java.util.Objects;

public class Theater implements Reviewable {
    String name;
    ArrayList<String> movies= new ArrayList<>();
    ArrayList<Review> reviews = new ArrayList<>();
    double stars;
    public Theater(String name){
        this.name = name;
        this.stars = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }
    public void deleteMovie(String movie){
            movies.remove(movie);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.getName() + '\'' +
                ", stars=" + stars +
                ", movies=" + this.getMovies() +
                ", reviews: " + reviews +
                '}';
    }

    private double getAverageStarsRating(){
        double sum = 0;
        for(Review review: reviews)
            sum+=review.getStars();
        return sum/reviews.size();
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
        Theater theater = (Theater) o;
        return Double.compare(theater.stars, stars) == 0 && Objects.equals(name, theater.name) && Objects.equals(movies, theater.movies) && Objects.equals(reviews, theater.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, movies, reviews, stars);
    }
}
