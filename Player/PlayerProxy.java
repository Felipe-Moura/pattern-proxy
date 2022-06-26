package Player;

public class PlayerProxy implements PlayerClass{
	
	private PlayerClass player;
	
	public PlayerProxy(PlayerClass newClass) {
		this.player = newClass;
	}

	@Override
	public void attack() {
		System.out.print("The " + player.getType() + " ");
		player.attack();
		System.out.println();
	}

	@Override
	public String getType() {
		return player.getType();
	}

	public PlayerClass getPlayer() {
		return player;
	}

	public void setPlayer(PlayerClass player) {
		this.player = player;
	}
	
	

}
