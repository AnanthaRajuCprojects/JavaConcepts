/**
 * anantharaju
 * Used to break loop or switch statement.
 * It breaks the current flow of the program at specified condition. 
 * In case of inner loop, it breaks only inner loop.
 */
package bsPackage;

public class BreakStatement 
{

	public static void main(String[] args) 
	{
		//Break Statement with Loop
		for(int i=1;i<=10;i++)
		{  
	        if(i==5)
	        {  
	            break;  
	        }  
	        System.out.println(i);  
	    }  
		System.out.println("\n");
		
		//Break Statement with Inner Loop
		 for(int i=1;i<=3;i++)
		 {    
             for(int j=1;j<=3;j++)
             {    
                 if(i==2&&j==2)
                 {    
                     break;    
                 }    
                 System.out.println(i+" "+j);    
             }    
		 }    
		 
		 //Break Statement with Switch - see Switch Statements
	}
}
