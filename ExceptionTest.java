package Assignment6;

public class ExceptionTest {
	  int a, b;
	
	public void ExceptionTest() {
		   System.out.println("No Input Recieved");
		
	}
	   public ExceptionTest(int a, int b) {
		   this.a=a;
		   this.b=b;
		  
	   }
	  int divide() {
		   System.out.println(a/b);
		   return a/b;
	   }
           
           public static void main(String[]args) {
        	   ExceptionTest exp=new ExceptionTest(2,1);
       		
       		try
       		{
       			exp.divide();
       		}
       		catch( ArithmeticException e) 
       		{
       			System.out.println("Division with zero is not possible");
       		}
       		catch(NumberFormatException ex)
       		{
       			System.out.println("Only integers are allowed");
       	    }
       		
       		System.out.println("Done!");
           }
}