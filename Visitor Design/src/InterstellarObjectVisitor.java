
public interface InterstellarObjectVisitor {
	
	
	void visit(Galaxy galaxy);
	void visit(Planet planet);
	void visit(Star star);
}
