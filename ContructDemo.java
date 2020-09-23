
public class ContructDemo {

		int num1;
		int num2;
		
	public ContructDemo(int num1,int num2)
	{
		System.out.println("in parameterized constructor");
		this.num1=num1;
		this.num2=num2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContructDemo obj=new ContructDemo(2,4);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
