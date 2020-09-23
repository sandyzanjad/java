
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,23,34,56,78,90};
		
	
		
		int b[]= {21,34,45};
		int c[]= {32,21,34,56,78};
		int f[]= {21,43,54,65,76};
		
		int d[][]= {
				{12,23,34,56,78,90},
				{21,34,45},
				{32,21,34,56,78},
				{21,43,54,65,76}
				};
		
	
//		for(int i=0;i<d.length;i++)
//		{
//			for(int j=0;j<d[i].length;j++) {
//				System.out.print(" "+d[i][j]);	
//			}
//			System.out.println();
//		}
			for (int k[]: d) {
				for(int l: k)
				{
					System.out.print(" "+l);
				}
		System.out.println();
			}
			
		
		
	}

}
