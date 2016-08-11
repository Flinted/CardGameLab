package cardgame;
import interfaces.*;
import java.util.*;


public class Dealer{

  private Deckable deck;

  public Dealer(Deckable deck){
    this.deck = deck;
  }

  public void shuffle(){
    this.deck.shuffle();
  }

  public Card dealToAll(ArrayList<Player> players){
    for(Player player : players){
      dealToOne(player);
    }
  }

  public Card dealToOne(Player player){
    Card card =  (deck)this.deck.deal();
    player.getCard(card); 
  }
}