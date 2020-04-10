
public class Spaceship implements InterstellarObjectVisitor {
	
	private final int T = 2;

	@Override
	public void visit(Galaxy galaxy) {
		System.out.println("It will take me, a spaceship, "+galaxy.getArrivalTime()*T+ "days to get to:"+galaxy.getName());
		

	}

	@Override
	public void visit(Planet planet) {
		System.out.println("It will take me, a spaceship, "+planet.getArrivalTime()*T+ "days to get to:"+planet.getName());

	}

	@Override
	public void visit(Star star) {
		System.out.println("It will take me, a spaceship, "+star.getArrivalTime()*T+ "days to get to:"+star.getName());

	}

}
