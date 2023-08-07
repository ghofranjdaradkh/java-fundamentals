import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);

        clock();
    }

    public static String pluralize(String word, int count) {
        if (count == 0 || count > 1) {
            return word + "s";
        } else {
            return word;
        }
    }
 public static void flipNHeads(int n) {
        int flips = 0;
        int headsInARow = 0;

        while (headsInARow < n) {
            double randomValue = Math.random(); 

            if (randomValue < 0.5) {
                System.out.println("tails");
                headsInARow = 0; 
            } else {
                System.out.println("heads");
                headsInARow++; 
            }

            flips++; 
        }

        System.out.println("It took " + flips + " flips to flip " + n + " head" + (n > 1 ? "s" : "") + " in a row.");
    }

    public static void clock() {
        LocalDateTime previousTime = LocalDateTime.MIN;
        int loopCount = 0;

        while (true) {
            LocalDateTime nowTime = LocalDateTime.now();
            if (!nowTime.equals(previousTime)) {
                previousTime = nowTime;
              String time = nowTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                double hertz = (double) loopCount / 1_000_000.0;
                String output =String.format("%s %.6f MHz%n", time, hertz);
                System.out.printf(output);
         
            }

            loopCount++;
        }
    }
   
}
