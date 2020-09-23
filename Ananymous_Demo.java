interface ABC{
	
	void show();
}
class Demo
{
	
public void show() 
{
	System.out.println(" i am in the Demo"); 
}
}

public class Ananymous_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC d= new ABC()
{
	public void show() 
	{
		System.out.println(" i am in the B"); 
	}
};
d.show();

	}

}
