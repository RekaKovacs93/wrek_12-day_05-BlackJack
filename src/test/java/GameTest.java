import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;
    Card newCard;
    Player player1;
    Player player2;
    ArrayList<Card> dealerCards;
    ArrayList<Card> player1Cards;
    ArrayList<Card> player2Cards;
    ArrayList<Player> players;
    Dealer dealer;
    Game game;
    @Before
    public void before(){
        card1 = new Card("Hearts", CardValue.TEN);
        card2 = new Card("Clubs", CardValue.FOUR);
        card3 = new Card("Hearts", CardValue.FOUR);
        card4 = new Card("Clubs", CardValue.FIVE);
        card5 = new Card("Hearts", CardValue.THREE);
        card6 = new Card("Clubs", CardValue.QUEEN);
        newCard = new Card("Diamond", CardValue.QUEEN);
        dealerCards = new ArrayList<>();
        player1Cards = new ArrayList<>();
        player2Cards = new ArrayList<>();
        dealerCards.add(card1);
        dealerCards.add(card2);
        player1Cards.add(card3);
        player1Cards.add(card4);
        player2Cards.add(card5);
        player2Cards.add(card6);
        player1 = new Player("Reka", player1Cards);
        player2 = new Player("Leo", player2Cards);
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        dealer = new Dealer("Carlos", dealerCards);
        game = new Game(dealer, players);
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, game.getDealer());
    }
    @Test
    public void hasPlayers(){
        assertEquals(players, game.getPlayers());
    }
    @Test
    public void hasWinner(){
        player2.addCard(newCard);
        System.out.println(player2.getTotal());
        assertEquals("Reka", game.getWinner());
    }
//    @Test
//    public void canEliminatePlayer(){
//        player2.addCard(newCard);
//        game.eliminatePlayer();
//        assertEquals(1, game.getPlayers().size());
//    }
}
