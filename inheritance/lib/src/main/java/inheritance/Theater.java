package inheritance;

import java.util.LinkedList;

 class Theater implements ReviewAll {

    private String name;
     private LinkedList<String> Movies = new LinkedList<>();
     private LinkedList<Review> reviews = new LinkedList<>();
     private int numStars;

     public Theater(String namesMovies) {
        this.name = namesMovies;

    }

     public String getName() {
         return name;
     }

     public LinkedList<Review> getReviews() {
         return reviews;
     }

     @Override
     public void addReview(String body, String author, int numStars) {
         Review newReview = new Review(body, author, numStars, this);
         reviews.add(newReview);
         System.out.println(reviews);
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




    public String addMovies(String movie) {
Movies.add(movie);
        return movie;
    }


    public void removeMovie(String movie) {
        System.out.println("Before removal: " + Movies);
        Movies.remove(movie);
        System.out.println("After removal: " + Movies);

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
