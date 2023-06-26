import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
        Card card1;
        Card card2;
        ArrayList<Card> cards;
        Player player;
        @Before
        public void before(){
            card1 = new Card("Hearts", CardValue.TEN);
            card2 = new Card("Clubs", CardValue.FIVE);
            cards = new ArrayList<>();
            cards.add(card1);
            cards.add(card2);
            player= new Player("Leo", cards);
        }
        @Test
        public void hasName(){
            assertEquals("Leo", player.getName());
        }
        @Test
        public void hasCards(){
            assertEquals(cards, player.getCards());
        }
        @Test
        public void canGetTotal(){
            assertEquals(15, player.getTotal());
        }
        @Test
        public void canSetAceValue(){
            player.setAceValue();
            assertEquals(15, player.getTotal());
        }
}
