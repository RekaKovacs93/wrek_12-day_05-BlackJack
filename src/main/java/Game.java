import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(Dealer dealer, ArrayList<Player> players){
        this.dealer = dealer;
        this.players = players;

    }

    public Dealer getDealer() {
        return dealer;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }


    public String getWinner(){
        Person winner = players.get(0);
        for (Player player : players){
            if (player.getTotal() > winner.getTotal() && player.getTotal() > dealer.getTotal() && player.getTotal() <= 21){
                return player.getName();
            }
        }
        return winner.getName();
    }

}
