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
}