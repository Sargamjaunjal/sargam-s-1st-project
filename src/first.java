class employees{
	int id;
	String name;
	String surname;
	
	 public void printdetails(){
		 System.out.println("my is is: "+ id);
		 
	 }
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sargam jaunjal");
		employees sargam=new employees();
		sargam.id=123;
		sargam.name="sargam";
		sargam.surname="jaunjal";
		System.out.println(sargam.id);
		
		
		sargam.printdetails();
		

	}

}
