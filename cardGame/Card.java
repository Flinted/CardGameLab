package cardgame;
import interfaces.*;
import java.util.*;

public class Card{
  private String suit;
  private String value;

  public Card(String suit, String value){
    this.suit = suit;
    this.value= value;
  }

  public String getCard(){
    return this.value + " of " + this.suit;
  }
}