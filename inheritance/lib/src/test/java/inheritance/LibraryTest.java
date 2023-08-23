package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void resturantTest() {
        //Arrenge
        Restaurant restaurant = new Restaurant("New Restaurant", 0, 20.0);
        //act
        String expected = "Restaurant{name='New Restaurant', numStars=0, price=20.0}";
        assertEquals(expected, restaurant.toString());
    }

    @Test
    public void ReviewTest() {
        Restaurant restaurant = new Restaurant("New Restaurant", 0, 20.0);
        Review review = new Review("Delicious !", "ghofran", 5, restaurant);
        String expected = "Review{Restaurant=New Restaurant, price=20.00, body='Delicious !', author='ghofran', numberstars=5}";
        assertEquals(expected, review.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant("New Restaurant", 0, 20.0);
        Review review = new Review("Delicious !", "ghofran", 5, restaurant);

        restaurant.addReview(review.getBody(), review.getAuthor(), review.getNumberstars());

        assertEquals(5, restaurant.getNumStars());
        assertEquals(5, review.getNumberstars());
        assertEquals(restaurant, review.getRestaurant());
    }

    @Test
    public void shopTest (){
        Shop newShop =new Shop("maccaMall","open 24 hours",20);
        assertEquals("maccaMall",newShop.getName());
        assertEquals("open 24 hours",newShop.getDescription());
        assertEquals(20,newShop.getNum$());
        String expected="Shop{name='maccaMall', description='open 24 hours', num$=20}";
        assertEquals( expected ,newShop.toString());}

    @Test
    public void theaterTest () {
        Theater theater = new Theater("NEW");
        assertEquals("NEW", theater.getName());

    }
        @Test
        public void testUpdateNumStars() {
            Restaurant restaurant = new Restaurant("New Restaurant", 0, 20.0);
            restaurant.addReview("Delicious food!", "Alice", 5);
            assertEquals(5, restaurant.getNumStars());

            restaurant.addReview("Good food!", "Bob", 3);
            assertEquals(4, restaurant.getNumStars());

            restaurant.addReview("Average food", "Carol", 2);
            assertEquals(3, restaurant.getNumStars());
        }



    @Test
    public void testUpdateNumStarsSHOP() {
        Shop newShop = new Shop("maccaMall", "open 24 hours", 20);
        newShop.addReview("beautiful", "amal", 4);
        assertEquals(4, newShop.getNumStars());

        newShop.addReview("Good", "ali", 3);
        assertEquals(3, newShop.getNumStars());

        newShop.addReview("amazing", "ahmad", 2);
        assertEquals(3, newShop.getNumStars());
    }



}
