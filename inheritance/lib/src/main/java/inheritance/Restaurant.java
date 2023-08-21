package inheritance;

import java.util.HashSet;
import java.util.Set;

class Restaurant {
    protected String name;
    protected int numStars;
    protected double price;
    protected Set<Review> reviews;

    public Restaurant(String name, int numStars, double price) {
        this.name = name;
        this.numStars = numStars;
        this.price = price;
        this.reviews = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", price=" + price +
                '}';
    }

    public void addReview(String body, String author, int numStars) {
        Review newReview = new Review(body, author, numStars, this);
        reviews.add(newReview);
        System.out.println(reviews);
        updateStars();
    }

    public void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.numberstars;
        }
        if (!reviews.isEmpty()) {
            numStars = totalStars / reviews.size();
        } else {
            numStars = 0;
        }
    }
}