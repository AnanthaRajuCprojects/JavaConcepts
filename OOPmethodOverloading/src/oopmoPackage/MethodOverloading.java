/**
 * @author anantharaju
 * If a class have multiple methods by same name but different parameters, it is known as Method Overloading.
 * NOTE: Method Overloaing is not possible by changing the return type of method
 * NOTE: method Overloading can be done on Main Method
 */
package oopmoPackage;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		int n1 = 2;
		int n2 = 3;
		int n3 = 5;
		
		MethodOverloading mo1 = new MethodOverloading();
		
		mo1.add(n1, n2);
		mo1.add(n1, n2, n3);
		
		mo1.add(10.5, 10.5);
		
		System.out.println("\nmain() method invoked");  
		main(12345);  
	}
	
	//Method Overloading by changing the no. of arguments
	void add(int n1, int n2)
	{
		System.out.println("\nSum of 2: "+(n1+n2));
	}
	
	void add(int n1, int n2, int n3)
	{
		System.out.println("\nSum of 3: "+(n1+n2+n3));
	}
	
	//Method Overloading by changing data type of argument
	void add(double n1, double n2)
	{
		System.out.println("\nSum of 2 (double): "+(n1+n2));
	}
	
	//Main Method Overloading
	public static void main(int a)
	{  
		  System.out.println(a);  
	}  
	
	//Method Overloading with Type-Promotion
	
}
