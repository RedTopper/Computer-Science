/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    private DeckTester() {
        
    }
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("[Tester][INFO] Creating Deck1 - Standard deck");
        test1();
        System.out.println("[Tester][INFO] Creating Deck2 - Small deck");
        test2();
        System.out.println("[Tester][INFO] Creating Deck3 - Smallest deck");
        test3();
        System.out.println("[Tester][INFO] Creating Deck4 - Multi deck");
        test4();
    }
    public static void test1() {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Heart", "Diamond", "Club", "Spade"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12, 13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println("[Deck1][INFO] -------------------------------------");
        System.out.println("[Deck1][INFO] This deck is: " + d);
        System.out.println("[Deck1][INFO] -------------------------------------");
        System.out.println("[Deck1][INFO] The size of this deck should be 52 and it is " + d.size());
        System.out.println("[Deck1][INFO] Drawing the top card gets us: " + d.deal());
        System.out.println("[Deck1][INFO] Drawing the next card gets us: " + d.deal());
        System.out.println("[Deck1][INFO] Drawing another card gets us: " + d.deal());
        System.out.println("[Deck1][INFO] Is the deck empty (false): " + d.isEmpty());
        System.out.println("[Deck1][INFO] -------------------------------------");
        System.out.println("[Deck1][INFO] This deck is: " + d);
        System.out.println("[Deck1][INFO] -------------------------------------");
    }
    public static void test2() {
        String[] ranks = {"A", "5", "Swag"};
        String[] suits = {"Black"};
        int[] pointValues = {1, 5, 10};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println("[Deck2][INFO] -------------------------------------");
        System.out.println("[Deck2][INFO] This deck is: " + d);
        System.out.println("[Deck2][INFO] -------------------------------------");
        System.out.println("[Deck2][INFO] The size of this deck should be 3 and it is " + d.size());
        System.out.println("[Deck2][INFO] Drawing the top card gets us: " + d.deal());
        System.out.println("[Deck2][INFO] Drawing the next card gets us: " + d.deal());
        System.out.println("[Deck2][INFO] Drawing last card gets us: " + d.deal());
        System.out.println("[Deck2][INFO] Drawing a card byond the deck gives us: " + d.deal());
        System.out.println("[Deck2][INFO] The size of this deck should now be 0 and it is " + d.size());
        System.out.println("[Deck2][INFO] Is the deck empty (true): " + d.isEmpty());
        System.out.println("[Deck2][INFO] -------------------------------------");
        System.out.println("[Deck2][INFO] This deck is: " + d);
        System.out.println("[Deck2][INFO] -------------------------------------");
    }
    public static void test3() {
        String[] ranks = {"Swag"};
        String[] suits = {"Swiggity"};
        int[] pointValues = {9001};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println("[Deck3][INFO] -------------------------------------");
        System.out.println("[Deck3][INFO] This deck is: " + d);
        System.out.println("[Deck3][INFO] -------------------------------------");
        System.out.println("[Deck3][INFO] The size of this deck should be 1 and it is " + d.size());
        System.out.println("[Deck3][INFO] Drawing the top card gets us: " + d.deal());
        System.out.println("[Deck3][INFO] Drawing a card byond the deck gives us: " + d.deal());
        System.out.println("[Deck3][INFO] Drawing a card byond the deck gives us: " + d.deal());
        System.out.println("[Deck3][INFO] The size of this deck should now be 0 and it is " + d.size());
        System.out.println("[Deck3][INFO] Is the deck empty (true): " + d.isEmpty());
        System.out.println("[Deck3][INFO] -------------------------------------");
        System.out.println("[Deck3][INFO] This deck is: " + d);
        System.out.println("[Deck3][INFO] -------------------------------------");
    }
    public static void test4() {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Heart", "Diamond", "Club", "Spade"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12, 13};
        Deck d1 = new Deck(ranks, suits, pointValues);
        Deck d2 = new Deck(ranks, suits, pointValues);
        Deck d3 = new Deck(ranks, suits, pointValues);
        System.out.println("[Deck4][INFO] -------------------------------------");
        System.out.println("[Deck4][INFO] This deck 1 is: " + d1);
        System.out.println("[Deck4][INFO] -------------------------------------");
        System.out.println("[Deck4][INFO] The size of this deck 1 should be 52 and it is " + d1.size());
        System.out.println("[Deck4][INFO] The size of this deck 2 should be 52 and it is " + d2.size());
        System.out.println("[Deck4][INFO] The size of this deck 3 should be 52 and it is " + d3.size());
        System.out.println("[Deck4][INFO] Drawing the top card of deck 1 gets us: " + d1.deal());
        System.out.println("[Deck4][INFO] Drawing the next card of deck 1 gets us: " + d1.deal());
        System.out.println("[Deck4][INFO] Drawing another card of deck 1 gets us: " + d1.deal());
        System.out.println("[Deck4][INFO] Drawing the top card of deck 2 gets us: " + d2.deal());
        System.out.println("[Deck4][INFO] The size of this deck 1 should now be 49 and it is " + d1.size());
        System.out.println("[Deck4][INFO] The size of this deck 2 should be 51 and it is " + d2.size());
        System.out.println("[Deck4][INFO] The size of this deck 3 should still be 52 and it is " + d3.size());
        System.out.println("[Deck4][INFO] -------------------------------------");
        System.out.println("[Deck4][INFO] This deck 1 is: " + d1);
        System.out.println("[Deck4][INFO] -------------------------------------");
    }
}
