package cardgame;
import interfaces.*;
import java.util.*;

public class Table{
  private ArrayList<Player> players;
  private Dealer dealer;
  private ArrayList<Card> tableCards;
  private ArrayList<Card> burnCards;
  private Ruleset rules;

  public Table(Dealer dealer, Ruleset ruleset){
      this.dealer = dealer;
      this.rules = ruleset;
  }

  public void addPlayer(String name){
    Player player = new Player(name);

    if(this.players == null){
      this.players = new ArrayList<Player>();
    }

    this.players.add(player);
  }

}