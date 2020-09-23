
class Emp
{
	int id;
	int salary;
	static String mgr="sandip";
	
public Emp(int i,int sal)
	{
	id=i;
	salary=sal;
	
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e=new Emp(12,10000);
	System.out.println(e.id+" "+e.salary+" "+Emp.mgr);	

	}

}
