public class Card {
    private String suite;
    private CardValue cardValue;

    public Card(String suite, CardValue cardValue){
        this.suite = suite;
        this.cardValue = cardValue;
    }

    public String getSuite() {
        return suite;
    }

    public int getCardValue() {
        return cardValue.getValue();
    }

}
