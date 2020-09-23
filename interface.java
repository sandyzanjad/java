
 interface Writer{
	
 void write();
	
}
 class Pen implements Writer{
	
 public void write()
 {
	 System.out.println("i am pen ");
 }
}
 
public class Interface_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Writer w=new Pen();	
	Pen p= new Pen();
	p.write();
	w.write();

	}

}
