package Assignment6;

public class TestExceptionCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer ct1=new Customer("C1234","Prathamesh","Platinum");
		
		
if ((ct1.getCustNo().startsWith("C")) || (ct1.getCustNo().startsWith("c"))) {
			
			System.out.println("Customer Number :" + ct1.getCustNo());
		}

		else {
			System.out.println(" Invalid  Customer Number..!  ");
			throw new Exception("Invalid number");	
		}
		
		
		
		if((ct1.getCustName().length())>=4) {
			
			System.out.println("Customer Name :" + ct1.getCustName());
		}
		else {
			System.out.println("Invalid Customer Name!");
			System.out.println(" Must be more than 4 characters..");
			throw new Exception("Invalid name");	
		}
	
if((ct1.getCategory()=="Platinum") || (ct1.getCategory()=="Gold" || (ct1.getCategory()=="SilverS"))) {
			
			System.out.println("Category :" + ct1.getCategory());
		}
		else {
			System.out.println("Invalid Customer Category!");
			System.out.println("Category Mismatched! ");
			throw new Exception("Invalid Category");	
		}
		
		
		
		
		
	}

	}


