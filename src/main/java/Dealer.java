import java.util.ArrayList;

public class Dealer extends Person{

    public Dealer(String name, ArrayList<Card> cards){
        super(name, cards);
    }
    public void twist(){
        if (getTotal() >= 16){
            getTotal();
        }
    }
}
