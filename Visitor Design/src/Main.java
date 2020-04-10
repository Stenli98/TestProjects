
public class Main {

	
		public static void main(String[] args) {
			
			
		InterstellarObjectVisitor astronaut = new Astronaut();
		InterstellarObjectVisitor spaceship = new Spaceship();
		
		//Interstellar Objects
		Galaxy andromeda = new Galaxy("Andromeda Galaxy", arrivalTime:5);
		Star sun = new Star ("The sun", arrivalTime:2);
		Planet venus = new Planet("Venus", arrivalTime:1);
		
		//Traveling to these planets
		astronaut.visit(venus);
		spaceship.visit(andromeda);
		astronaut.visit(sun);
		}
}
