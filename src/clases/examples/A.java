package clases.examples;

public class A {

	public B b;
	
	private C c;
	
	public String strA;
	
	private String strB;
	
	public A() {
		b = new B();
		c = new C();
		strA = "strA";
		strB = "strB";
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public String getStrA() {
		return strA;
	}

	public void setStrA(String strA) {
		this.strA = strA;
	}

	public String getStrB() {
		return strB;
	}

	public void setStrB(String strB) {
		this.strB = strB;
	}
}
