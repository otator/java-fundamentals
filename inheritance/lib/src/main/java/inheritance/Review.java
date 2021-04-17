package inheritance;

public class Review {
    private String author;
    private int stars;
    private String body;
    private String movie;


    public Review(String author, int stars, String body){
        this.author = author;
        if(stars>5)
            this.stars = 5;
        else if(stars < 0)
            this.stars = 0;
        else
            this.stars = stars;
        this.body = body;
    }
    public Review(String author, int stars, String body, String movie){
        this.author = author;
        if(stars>5)
            this.stars = 5;
        else if(stars < 0)
            this.stars = 0;
        else
            this.stars = stars;
        this.body = body;
        this.movie = movie;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }


    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", stars=" + stars +
                ", body='" + body + '\'' +
                (movie==null? "": " the movie was: " +movie) +
                '}';
    }
}
