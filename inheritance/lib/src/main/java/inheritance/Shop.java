package inheritance;


import java.util.LinkedList;

public class Shop  implements ReviewAll {

    private String name ;
    private String description;
    private  int num$;
    private LinkedList<Review> reviews = new LinkedList<>();

    private int numStars;


    @Override
    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public Shop(String name, String description, int num$) {

        this.name = name;
        this.description=description;
        this.num$=num$;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNum$() {
        return num$;
    }

    public int getNumStars() {
        return numStars;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", num$=" + num$ +
                '}';
    }




    @Override
    public void addReview(String body, String author, int numStars) {
        Review newReview = new Review(body, author, numStars,this );
        reviews.add(newReview);
        updateStars();
    }
    @Override
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
