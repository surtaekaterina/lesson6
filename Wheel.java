package transport;

public class Wheel {

	double radius;
	String material;
	double pressure;

	// �����������
	public Wheel() {

	}

	public Wheel(double pressure) {
		this.pressure = pressure;
	}

	public void demageWheel() {
		this.pressure = 0;
	}
}
