import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class DealerTest {
    Card card1;
    Card card2;
    ArrayList<Card> cards;
    Dealer dealer;
    @Before
    public void before(){
        card1 = new Card("Hearts", CardValue.ACE);
        card2 = new Card("Clubs", CardValue.FOUR);
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        dealer= new Dealer("Carlos", cards);
    }
    @Test
    public void hasName(){
        assertEquals("Carlos", dealer.getName());
    }
    @Test
    public void hasCards(){
        assertEquals(cards, dealer.getCards());
    }
    @Test
    public void canGetTotal(){
        assertEquals(5, dealer.getTotal());
    }
    @Test
    public void canSetAceValue(){
        dealer.setAceValue();
        assertEquals(15, dealer.getTotal());
    }

}
