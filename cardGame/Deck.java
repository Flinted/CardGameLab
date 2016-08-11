package cardgame;
import interfaces.*;
import java.util.*;

public class Deck implements Deckable{
  private int size;
  private ArrayList<Card> deck;
  private ArrayList<String> suits;
  private ArrayList<String> values;

  public Deck(Ruleset ruleset){
    this.suits = ruleset.getSuits();
    this.values= ruleset.getValues();
  }

  public void prepareDeck(){
    createDeck();
    shuffle();
  }

  public void createDeck(){
    if(this.deck != null){
      this.deck.clear();
    }

    for(String suit : suits){
      for(String value : values){
        Card card = new Card(suit, value);
        addCard(card);
      }
    }
  }

  public int numberCards(){
    return this.deck.size();
  }

  public void addCard(Card card){
    if(this.deck == null){
      this.deck = new ArrayList<Card>();
    }
    deck.add(card);
  }

  public Card deal(){
    return this.deck.remove(this.deck.size()-1);
  }

  public void shuffle(){

  }
}