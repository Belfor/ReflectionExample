package clases.examples;

public class C {

	private Integer integerC;
	
	private D d;
	
	public C() {
		integerC = 2;
		d = new D();
	}

	public Integer getIntegerC() {
		return integerC;
	}

	public void setIntegerC(Integer integerC) {
		this.integerC = integerC;
	}

	public D getD() {
		return d;
	}

	public void setD(D d) {
		this.d = d;
	}
	
	
	
}
