package transport;

public class Track extends Auto {
private int cargo;



public Track() {
	super("gaz", new Engine (4.2f), 4);
	System.out.println("Track");
	// TODO Auto-generated constructor stub
}

public Track (String mark, Engine engine, int count) {
	super(mark, engine, count);
	// TODO Auto-generated constructor stub
}

public Track(int cargo) {
	super();
	this.cargo = cargo;
}

public int getCargo() {
	return cargo;
}

public void setCargo(int cargo) {
	this.cargo = cargo;
}

	
}
