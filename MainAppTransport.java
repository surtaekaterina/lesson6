package transport;

public class MainAppTransport {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		new Auto();
		
		Auto auto = new Auto("fiat", new Engine(1.4f), 4);
		// auto.engine = null;
		// auto.mark = "rtrtrtr";

		auto.setEngine(new Engine(1.6f));

		System.out.println(auto.getMark());

		auto.upgrade(new Engine(1.8f), "black");
		System.out.println(auto.getMark() + ", " + auto.getEngine() + " ," + auto.getColor());
		
		Track track = new Track();
		Bus bus = new Bus();
		
		
		System.out.println();
		
	}

}
