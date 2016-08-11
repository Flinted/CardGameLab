package cardgame;

public class PlayerFactory{

    public Player makePlayer(String name){
      Player player = new Player(name);
    }
}