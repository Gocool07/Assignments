package triangle;

public class triangle {
	void area()
	{
		int h=4,b=7;
		System.out.println("Area of triangle is:"+h*b/2);
	
	}
	void perimeter()
	{
		int a=3,b=4,c=5;
		System.out.println("Perimeter of Triangle:"+(a+b+c));
	}

	public static void main(String[] args) {
	 triangle obj=new triangle();
	 obj.area();
	 obj.perimeter();

	}

}
