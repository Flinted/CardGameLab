package cardgame;
import java.util.*;

public class Ruleset{
  private String gameName;
  private ArrayList<String> suits;
  private ArrayList<String> values;

  public Ruleset(String name){
    this.gameName = name;
    this.suits =  new ArrayList<String>();
    suits.add("Diamonds");
    suits.add("Hearts");
    suits.add("Spades");
    suits.add("Clubs");
    this.values = new ArrayList<String>();
    suits.add("2");
    suits.add("3");
    suits.add("4");
    suits.add("5");
    suits.add("6");
    suits.add("7");
    suits.add("8");
    suits.add("9");
    suits.add("10");
    suits.add("Jack");
    suits.add("Queen");
    suits.add("King");
    suits.add("Ace");
  }

  public ArrayList<String> getSuits(){
    return this.suits;
  }

  public ArrayList<String> getValues(){
    return this.values;
  }
}