
public interface InterstellarObject {
	void accept(InterstellarObject visitor);

	void visit(Planet planet);
}
