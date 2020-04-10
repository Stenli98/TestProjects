
public class Astronaut implements InterstellarObjectVisitor {
	
	private final int T=5; 
	


	@Override
	public void visit(Galaxy galaxy) {
		System.out.println("It will take me, and astronaut, "+galaxy.getArrivalTime()*T+ "days to get to:"+galaxy.getName());
	
		
	
	}

	public void visit(Planet planet) {
		System.out.println("It will take me, and astronaut, "+planet.getArrivalTime()*T+ "days to get to:"+planet.getName());
		

	}

	@Override
	public void visit(Star star) {
		System.out.println("It will take me, and astronaut, "+star.getArrivalTime()*T+ "days to get to:"+star.getName());
		

	}

}
