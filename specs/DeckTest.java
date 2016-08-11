import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;
import interfaces.*;

public class DeckTest{
  Deckable deck;

  @Before
  public void before(){
    Ruleset ruleset = new Ruleset("Snap");
    this.deck = new Deck(ruleset);
  }

  @Test
  public void deckCreation(){
    deck.createDeck();
    assertEquals(52, deck.numberCards());
  }
}
