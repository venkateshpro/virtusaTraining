package Day9;

public class neastedClasess {
	int age=30;
	public void outer() {
		System.out.println(" this is the outer method");
	}
	
	class inner{
		int id=20;
		
		public void iner() {
			System.out.println("this is the inner method ");
		}
		
	}
	

}
class main{
	
	
	public static void main(String[] args) {
		
		neastedClasess ou= new neastedClasess();
		System.out.println(ou.age);
		ou.outer();
		
		neastedClasess.inner objin= ou.new inner();
		System.out.println(objin.id);
		objin.iner();
		
	}
	
}
