import Player.Assassin;
import Player.Barbarian;
import Player.Mage;
import Player.PlayerProxy;

public class Main {

	public static void main(String[] args) {
		
		PlayerProxy player = new PlayerProxy(new Barbarian());
		
		System.out.println("The player is a " + player.getType());
		player.attack();
		
		System.out.println("The player changed class");
		
		player.setPlayer(new Mage());
		System.out.println("The player is a " + player.getType());
		player.attack();
		
		System.out.println("The player changed class");
		
		player.setPlayer(new Assassin());
		System.out.println("The player is a " + player.getType());
		player.attack();

	}

}
