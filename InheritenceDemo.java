
class Cal{
	
	public int add(int i,int j) {
		
		return i+j;
	}
}
class CalAdv extends Cal{
	
	public int sub(int i,int j) {
		
		return i-j;
	}
}
class CalVery extends CalAdv{
	
	public int  mult(int i,int j) {
		
		return i*j;
	}
}
public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalVery c=new CalVery();
		int result1=c.add(14,9);
		int result2=c.sub(14,9);
		int result3=c.mult(14,9);
		System.out.println("in Superr class");
		System.out.println(result1);
		System.out.println("in sub-class ");
		System.out.println(result2);
		System.out.println("in sub-child class");
		System.out.println(result3);
	}

}
