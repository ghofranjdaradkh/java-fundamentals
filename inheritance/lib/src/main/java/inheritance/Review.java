package inheritance;

public class Review {

    protected String body;
    protected String author;
    protected int numberstars;
    protected Restaurant restaurant;

    public Review(String body, String author, int numberstars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.numberstars = numberstars;
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberstars=" + numberstars +
                ", restaurant=" + restaurant +
                '}';
    }

    public int getNumberStars() {
        return numberstars;
    }

    public void updateStars(int newStars) {
        if (newStars >= 0 && newStars <= 5) {
            numberstars = newStars;
        } else {
            System.out.println("Stars must be between 0 and 5");
        }
    }
}
