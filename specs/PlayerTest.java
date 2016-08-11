import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;
import interfaces.*;

public class PlayerTest{

  Player player;

  @Before
  public void before(){
    this.player = new Player("Renwick");
  }

  @Test
  public void playerHasName(){
    assertEquals("Renwick", player.getName());
  }

  @Test
  public void playerHasNoCardsAtStart(){
    assertEquals(0, player.cardCount());
  }

  @Test
  public void playerCanGetCards(){
    assertEquals();
  }


}
