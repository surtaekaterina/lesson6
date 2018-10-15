package transport;

public class Bus extends Auto {
	
	private int passengers;

	public Bus() {
		// super();\
		System.out.println("Bus");
		// TODO Auto-generated constructor stub
	}

	public Bus(String mark, Engine engine, int countWheel, int passengers) {
		super(mark, engine, countWheel);
		this.passengers = passengers;
		
		// TODO Auto-generated constructor stub
	}

	public Bus(int passengers) {
		super();
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

}
