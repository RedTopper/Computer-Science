/**
 * This is a class that tests the Card class.
 */
public class CardTester
{
    public void compareCard()
    {
        Card card1 = new Card("A", "Hearts", 1);
        Card card2 = new Card("A", "Hearts", 1);
        System.out.print("The value should be true and it is: ");
        System.out.println(card1.matches(card2));
        Card card3 = new Card("A", "Hearts", 1);
        Card card4 = new Card("A", "Hearts", 2);
        System.out.print("The value should be false and it is: ");
        System.out.println(card3.matches(card4));
        Card card5 = new Card("A", "Hearts", 1);
        Card card6 = new Card("A", "Diamonds", 1);
        System.out.print("The value should be false and it is: ");
        System.out.println(card5.matches(card6));
    }
    public void testValueSuit()
    {
        Card card1 = new Card("9", "Hearts", 9);
        System.out.print("The value should be Hearts and it is: ");
        System.out.println(card1.suit());
    }
    public void testValueRank()
    {
        Card card1 = new Card("A", "Diamonds", 1);
        System.out.print("The value should be A and it is: ");
        System.out.println(card1.rank());
    }
    public void testValueValue()
    {
        Card card1 = new Card("2", "Hearts", 2);
        System.out.print("The value should be 2 and it is: ");
        System.out.println(card1.pointValue());
    }
}
