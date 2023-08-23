/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Algerbal", 0, 20.0);

        Review review = new Review("Delicious !", "ghofran", 5, restaurant);

        restaurant.addReview("good ", "ali", 3);

        restaurant.addReview("very good", "ahmad", 5);

        System.out.println(review);
        System.out.println("all restaurant reviews : "+restaurant.getReviews());
        System.out.println("**update number of stars after reviews for restaurant : "+restaurant.updateStars());
        System.out.println("========================================================================\n");

        Shop shop =new Shop( "meccaMall", "it is open 24", 20);
        Review review1 = new Review("new", "ghofran", 1, shop);
        System.out.println(review1);
        shop.addReview("amazing","ghofran",4);
        shop.addReview("amazing","rami",2);
        System.out.println("all shop reviews : "+shop.getReviews());
        System.out.println("**update number of stars after reviews for shop : "+shop.updateStars());
        System.out.println("========================================================================\n");

        Theater theater = new Theater("the god father" );
        Review review2 = new Review("old", "ghofran", 1, theater);
         theater.addMovies("new movie");
         theater.addMovies("bad movie");
         theater.removeMovie("bad movie");
        theater.addReview("good", "amal", 5);
        theater.addReview("amazing", "ali", 2);
        System.out.println(review2);
        System.out.println("all theater reviews : "+theater.getReviews());
        System.out.println("**update number of stars after reviews for theater : "+theater.updateStars());

}}







