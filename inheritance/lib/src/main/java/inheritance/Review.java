package inheritance;

import java.util.LinkedList;

public class Review {

    private  Shop shop;
    // Define instance variables
    private String body;
    private String author;
    private int numberstars;
    private Restaurant restaurant; // Restaurant associated with the review
    private  Theater theater;
    private LinkedList<Review> reviews = new LinkedList<>();



    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberstars() {
        return numberstars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    // Constructor to create a Review instance
    public Review(String body, String author, int numberstars, Theater theater) {
        this.body = body;
        this.author = author;
        this.numberstars = numberstars;
        this.theater = theater;
    }
    public Review(String body, String author, int numberstars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.numberstars = numberstars;
        this.restaurant = restaurant;
    }


    public Review(String body, String author, int numberstars, Shop shop) {
        this.body = body;
        this.author = author;
        this.numberstars = numberstars;
        this.shop = shop;
    }

    public String toString() {
        String placeType = "";
        String placeName = "";

        if (shop != null) {
            placeType = "Shop";
            placeName = shop.getName();
        } else if (restaurant != null) {
            placeType = "Restaurant";
            placeName = restaurant.getName();
        } else if (theater != null) {
            placeType = "Theater";
            placeName = theater.getName();
        } else {
            return "Invalid Review";
        }

        String additionalDetails = "";
        if (restaurant != null) {
            additionalDetails = String.format(", price=%.2f", restaurant.getPrice());
        } else if (shop != null) {
            additionalDetails = String.format(", description=%s, num$=%d, numStars=%d", shop.getDescription(), shop.getNum$(), shop.getNumStars());
        }

        return "Review{" +
                placeType + '=' + placeName +
                additionalDetails +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberstars=" + numberstars +
                '}';
    }






    public int getNumberStars() {
        return numberstars;
    }

    // Method to update the number of stars given in the review
    public void updateStars(int newStars) {
        if (newStars >= 0 && newStars <= 5) {  // Check if newStars is within the valid range
            numberstars = newStars;  // Update the number of stars
        } else {
            System.out.println("Stars must be between 0 and 5");  // Print an error message if the range is violated
        }
    }
}
