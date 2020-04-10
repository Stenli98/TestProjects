
public class Star implements InterstellarObject {
	private String name;
	private int arrivalTime;
	
	public Star(String name, int arrivalTime){
		this.name = name;
		this.arrivalTime = arrivalTime;
	}
	
	public String getName(){
		return this.name; 
	}
	
	public int getArrivalTime(){
		return this.arrivalTime;

	@Override public void accept(InterstellarObjectVisitor visitor) {
		visitor.visit(this);
		
	}
}