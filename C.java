
public class C extends B{
	
	
	public C() {
		super("b");
		System.out.println("C()");
	}
	
	public C(String param) {
		super(param);
		System.out.println("C(.)" + param);
	}
}
