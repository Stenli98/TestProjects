
public class Planet implements InterstellarObject {
	private String name;
	private int arrivalTime;
	
	public Planet(String name, int arrivalTime){
		this.name = name;
		this.arrivalTime = arrivalTime;
	}

	@Override
	public void accept(InterstellarObject visitor) {
		visitor.visit(this);
		
	}
	

	
}
