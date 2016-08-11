package cardgame;
import interfaces.*;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Ruleset ruleset = new Ruleset("Snap");
    Deckable deck = new StandardDeck(ruleset);
    Dealer dealer = new Dealer(deck);
    Table table = new Table(dealer, ruleset);

  }
}