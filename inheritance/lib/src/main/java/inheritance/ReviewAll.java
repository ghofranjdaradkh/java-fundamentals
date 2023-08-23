package inheritance;

import java.util.LinkedList;

public interface ReviewAll {
    void addReview(String body, String author, int numStars);
    int updateStars() ;
    LinkedList<Review> getReviews();
    String toReviewString();
}



