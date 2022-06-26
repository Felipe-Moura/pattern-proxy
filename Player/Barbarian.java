package Player;

public class Barbarian implements PlayerClass{
	
	private String type;
	
	public Barbarian() {
		this.type = "Barbarian";
	}

	@Override
	public void attack() {
		System.out.println("Attacked with an axe!");	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
