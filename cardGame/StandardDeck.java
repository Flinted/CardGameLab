package cardgame;

public class StandardDeck implements deckable{
  private int size;
  private ArrayList<Card> deck;
  private ArrayList<String> suits;
  private ArrayList<String> values;

  public StandardDeck(Ruleset ruleset){
    this.suits = ruleset.getSuit();
    this.values= ruleset.getValues();
  }

  public void prepareDeck(){
    createDeck();
    shuffleDeck();
  }
}