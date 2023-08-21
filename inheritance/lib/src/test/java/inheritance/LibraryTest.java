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
        String expected = "Review{body='Delicious !', author='ghofran', numberstars=5, restaurant=" + restaurant.toString() + "}";
        assertEquals(expected, review.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant("New Restaurant", 0, 20.0);
        Review review = new Review("Delicious !", "ghofran", 5, restaurant);

        restaurant.addReview(review.body, review.author, review.numberstars);

        assertEquals(5, restaurant.numStars);
        assertEquals(5, review.numberstars);
        assertEquals(restaurant, review.restaurant);
    }
}
