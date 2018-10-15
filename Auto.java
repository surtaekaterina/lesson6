package transport;

public class Auto {
	private String mark;
	private Engine engine;
	private String color;
	private Wheel[] wheel;
	
	
	public  Auto() {
	System.out.println("Auto()");
	}
	
	

	//public Auto() {

	//}

	public Auto(String mark, Engine engine, int countWheel) {
		this.mark = mark;
		this.engine = engine;
		this.color = "white";
		this.wheel = new Wheel[countWheel];
System.out.println("Auto(..)");
	}

	/*
	 * public String readMark() { return this.mark; }
	 */
	public String getMark() {
		return this.mark;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void upgrade(Engine engine, String color) {
		// null !
		if (engine.getVolume() > this.engine.getVolume()) {
			this.engine = engine;
		}
		if (!color.equals("white")) {
			this.color = color;
		}
	}

public int getCountWheel() {
	return this.wheel.length; 
}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}
}
