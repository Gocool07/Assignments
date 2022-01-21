package student;

public class Student {
	String name;
	int id;
	
	void detail()
	{
	System.out.println("Student name:"+name );
	System.out.println("Student id:"+id);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.name="Jhon";
		obj.id=2;
	     obj.detail();
		
		}

}
