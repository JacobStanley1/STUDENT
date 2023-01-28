package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jacob Stanley
 * @author Jacob Stanley Jan 27, 2023 
 */
import java.util.Random;

public class CardTrick {
    private final String[] suits = {"hearts", "diamonds", "clubs", "spades"};
    private final String[] cards = new String[7];
    private final Random rand = new Random();

    public CardTrick() {
        for (int i = 0; i < 7; i++) {
            int value = rand.nextInt(13) + 1;
            int suitIndex = rand.nextInt(4);
            cards[i] = value + " of " + suits[suitIndex];
        }
    }

    public void printInfo() {
        System.out.println("The card you picked is in the hand!");
    }

    public void findCard(String pickedCard) {
        boolean found = false;
        for (int i = 0; i < 7; i++) {
            if (cards[i].equals(pickedCard)) {
                found = true;
                printInfo();
                break;
            }
        }
        if (!found) {
            System.out.println("The card you picked is not in the hand.");
        }
    }

    public static void main(String[] args) {
        CardTrick trick = new CardTrick();
        // Uncomment the following line for debugging purposes
        // System.out.println(Arrays.toString(trick.cards));
        System.out.print("Pick a card: ");
        String pickedCard = System.console().readLine();
        trick.findCard(pickedCard);
    }
}
