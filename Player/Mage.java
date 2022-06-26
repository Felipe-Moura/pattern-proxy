package Player;

public class Mage implements PlayerClass{
	
	private String type;

	public Mage() {
		this.type = "Mage";
	}
	
	@Override
	public void attack() {
		System.out.println("Attacked with magic!");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
