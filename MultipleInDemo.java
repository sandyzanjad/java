class A{
	
	public void show() {
		System.out.println("In Class A");
	}
}

class B{
	
	public void show() {
		System.out.println("In Class B");
	}
}

class C extends A
{
	
}
public class MultipleInDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	C c= new C();
	c.show();

	}

}
