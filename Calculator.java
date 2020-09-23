
public class Calculator {

  int id=10;
  String name="Sandip";
  int sal;
  
  public void display() 
  {
	  System.out.println(id+" "+name);
	  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator c =new Calculator();
	c.display();
	c.sal=10000;
	System.out.println(c.sal);
	}
}


