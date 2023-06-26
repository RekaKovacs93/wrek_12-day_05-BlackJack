import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Card> cards;
    public Person(String name, ArrayList<Card> cards){
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    public int getTotal(){
        int total = 0;
        for (Card card : cards){
            total += card.getCardValue();
        }
        return total;
    }
    public void addCard(Card card){
        cards.add(card);
    }
    public void setAceValue(){
        for (Card card : cards) {
            if (card.getCardValue() == CardValue.ACE.getValue()) {
                CardValue.ACE.setAceValue();
            }
        }
    }
}
