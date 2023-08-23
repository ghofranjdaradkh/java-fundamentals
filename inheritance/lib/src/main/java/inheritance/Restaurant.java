package inheritance;

import java.util.LinkedList;

class Restaurant implements ReviewAll{
    // Define instance variables
    private String name;
    private int numStars;
    private double price;
    private LinkedList<Review> reviews = new LinkedList<>();


    // Constructor to create a Restaurant instance
    public Restaurant(String name, int numStars, double price) {
        this.name = name;
        this.numStars = numStars;
        this.price = price;
        this.reviews = getReviews();; // Initialize the reviews set
    }


    public String getName() {
        return name;
    }

    public int getNumStars() {
        return numStars;
    }

    public double getPrice() {
        return price;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }



    // Override the toString() method to provide a formatted string representation
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numStars=" + numStars +
                ", price=" + price +
                '}';
    }

    // Method to add a new review to the restaurant
    public void addReview(String body, String author, int numStars) {
        Review newReview = new Review(body, author, numStars, this);
        reviews.add(newReview);
        updateStars();
    }

    // Method to update the average rating of the restaurant based on reviews
    public int updateStars() {
        int totalStars = 0;  // Initialize the total stars counter
        // Iterate through each review in the reviews set
        for (Review review : reviews) {
            totalStars += review.getNumberStars();
        }

        if (!reviews.isEmpty()) {
            numStars = totalStars / reviews.size();  // Calculate the new average rating
        } else {
            numStars = 0;  // If no reviews, set the average rating to 0
        }
        return numStars;
    }

    @Override
    public String toReviewString() {
        StringBuilder reviewString = new StringBuilder(" Reviews:\n");
        for (Review review : reviews) {
            reviewString.append(review).append("\n");
        }
        return reviewString.toString();
    }

    }



