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
    values.add("2");
    values.add("3");
    values.add("4");
    values.add("5");
    values.add("6");
    values.add("7");
    values.add("8");
    values.add("9");
    values.add("10");
    values.add("Jack");
    values.add("Queen");
    values.add("King");
    values.add("Ace");
  }

  public ArrayList<String> getSuits(){
    return this.suits;
  }

  public ArrayList<String> getValues(){
    return this.values;
  }
}