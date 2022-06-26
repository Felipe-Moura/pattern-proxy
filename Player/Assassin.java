package Player;

public class Assassin implements PlayerClass{
	
	private String type;
	
	public Assassin() {
		this.type = "Assassin";
	}

	@Override
	public void attack() {
		System.out.println("Attacked with a dagger!");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
