package LabProject;

public class Test {
	public static void main(String[] args) {
		System.out.println("******************************* HugeInteger(int n) Constructor *******************************\n");
        
		HugeInteger A = new HugeInteger(3);
        System.out.println("Testing for HugeInteger(int n) - small number: " + A.toPrint(A) + "\n");
        
        HugeInteger B = new HugeInteger(40);
        System.out.println("Testing for HugeInteger(int n) - large number: " + B.toPrint(B)+ "\n");
        
        try {
        	 HugeInteger C = new HugeInteger(0);
             System.out.println("Testing for HugeInteger(int n) - zero: " + C.toPrint(C));
        }
        catch (IllegalArgumentException e){
        	System.out.println("Testing for HugeInteger(int n) - zero: " + e + "\n");
        }
        try {
        	HugeInteger D = new HugeInteger(-23);
            System.out.println("Testing for HugeInteger(int n) - negative number: " + D.toPrint(D));
            }
       catch (IllegalArgumentException e){
    	   System.out.println("Testing for HugeInteger(int n) - negative number: " + e + "\n");
    	   }
        
        
        
        System.out.println("******************************* HugeInteger(String x) Constructor *******************************\n");
        
        HugeInteger constructor1 = new HugeInteger ("12345678654");
        System.out.println("Testing for HugeInteger(String x): " + constructor1.toPrint(constructor1) + "\n");
        
        try {
        	HugeInteger constructor2 = new HugeInteger ("-");
            System.out.println("Testing for HugeInteger(String x) - just a negative sign: " + constructor2.toPrint(constructor2) + "\n");
        }
        catch (IllegalArgumentException e){
        	System.out.println("Testing for HugeInteger(String x) - just a negative sign: " + e + "\n");
        }
        try {
        	HugeInteger constructor2 = new HugeInteger ("0");
            System.out.println("Testing for HugeInteger(String x) - just a 0: " + constructor2.toPrint(constructor2) + "\n"); 
        }
        catch (IllegalArgumentException e){
        	System.out.println("Testing for HugeInteger(String x) - just a 0: " + e + "\n");
        }
        try {
        	HugeInteger constructor3 = new HugeInteger ("12h#$%d31412");
            System.out.println("Testing for HugeInteger(String x) - letters/symbols: " + constructor3.toPrint(constructor3) + "\n");   
        }
        catch (IllegalArgumentException e){
        	System.out.println("Testing for HugeInteger(String x) - letters/symbols: " + e + "\n");
        }
        
        
		
		System.out.println("******************************* Add Method *******************************\n");
		HugeInteger a=new HugeInteger("129992319325673215093") ;
		HugeInteger b=new HugeInteger("129992319325673215093") ;
		System.out.println("Testing for add - same two numbers: 129992319325673215093 + 129992319325673215093 = " + a.toPrint(a.add(b)) +"\n");
        
		HugeInteger a1=new HugeInteger("12999231932515093") ;
		HugeInteger b1=new HugeInteger("12325673215093") ;
		System.out.println("Testing for add - Different two numbers of different sizes: 12999231932515093 + 12325673215093 = " + a1.toPrint(a1.add(b1)) +"\n");
        
		HugeInteger a2=new HugeInteger("-500999998079093") ;
		HugeInteger b2=new HugeInteger("-9017412325673215093") ;
		System.out.println("Testing for add - Two negative numbers of different sizes: -500999998079093 - 9017412325673215093 = " + a2.toPrint(a2.add(b2)) +"\n");

		HugeInteger a3 = new HugeInteger("-189612452148");
		HugeInteger b3 = new HugeInteger("18961248");
		System.out.println("Testing for add - One negative and One positive - -189612452148 +  18961248 = " + a3.toPrint(a3.add(b3)) +"\n");
		
		HugeInteger a4 = new HugeInteger("-9999999999999");
		HugeInteger b4 = new HugeInteger("1");
		System.out.println("Testing for add - One negative and One positive - 1 -9999999999999 = " + a4.toPrint(a4.add(b4)) +"\n\n");
		
		
		
		System.out.println("******************************* Subtract Method *******************************\n");
		
		HugeInteger r2=new HugeInteger("-500999998079094123133") ;
		HugeInteger s2=new HugeInteger("-9017412325673215093") ;
		System.out.println("Testing for subtract - Two negative numbers of different sizes: -500999998079094123133 - (-9017412325673215093) = " + r2.toPrint(r2.subtract(s2)) +"\n");

		HugeInteger r3 = new HugeInteger("-189612452148");
		HugeInteger s3 = new HugeInteger("18961248");
		System.out.println("Testing for subtract - One negative and One positive - -189612452148 -  18961248 = " + r3.toPrint(r3.subtract(s3)) +"\n");
		
		HugeInteger r4 = new HugeInteger("-9999999999999");
		HugeInteger s4 = new HugeInteger("1");
		System.out.println("Testing for subtract - One negative and One positive - (-9999999999999) - 1  = " + r4.toPrint(r4.subtract(s4)) +"\n\n");
		
		
		
		System.out.println("******************************* Multiply Method *******************************\n");
		HugeInteger mult1=new HugeInteger("1") ;
		HugeInteger mult2=new HugeInteger("1687") ;
		System.out.println("Testing for Multiply: 1 * 1687 = " + mult1.toPrint(mult1.multiply(mult2)) +"\n");
		
		
		try {
			HugeInteger mult3=new HugeInteger("0") ;
			HugeInteger mult4=new HugeInteger("321681532162912") ;
			System.out.println("Testing for Multiply: 0 * 321681532162912 = " + mult1.toPrint(mult3.multiply(mult4)) +"\n");
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Testing for Multiply: 321681532162912 x 0 = 0 \n");
		}
		

		HugeInteger mult5=new HugeInteger("-2135768453766756") ;
		HugeInteger mult6=new HugeInteger("21378219") ;
		System.out.println("Testing for Multiply: -2136 * 21378219 = " + mult5.toPrint(mult5.multiply(mult6)) +"\n");
		
		
		
		
		
		
		System.out.println("******************************* CompareTo *******************************\n");
		HugeInteger compare1 = new HugeInteger("12999231932532193") ;
		HugeInteger compare2 = new HugeInteger("12973215093") ;
		System.out.println("Testing for compareTo - Normal case: 12999231932532193 > 12973215093?  " + compare1.compareTo(compare2)+"\n");
		
		
		HugeInteger compare3 = new HugeInteger("-5321932321525") ;
		HugeInteger compare4 = new HugeInteger("12971241243215093") ;
		System.out.println("Testing for compareTo - One negative one positive: -5321932321525 > 12971241243215093?  " + compare3.compareTo(compare4)+"\n");
		
		HugeInteger compare5 = new HugeInteger("-5321932321525") ;
		HugeInteger compare6 = new HugeInteger("-12971241243215093") ;
		System.out.println("Testing for compareTo - Two negatives: -5321932321525 > -12971241243215093?  " + compare5.compareTo(compare6)+"\n");
		
		HugeInteger compare7 = new HugeInteger("123456789") ;
		HugeInteger compare8 = new HugeInteger("123456789") ;
		System.out.println("Testing for compareTo - Same number: 123456789 > 123456789?  " + compare7.compareTo(compare8)+"\n\n");
		
		
		System.out.println("******************************* toString *******************************\n");
		
		HugeInteger toString1 = new HugeInteger("1234567234289") ;
		System.out.println("Testing for toString - positive number: " + toString1.toString() + "\n" );
		
		HugeInteger toString2 = new HugeInteger("-13456347287124289") ;
		System.out.println("Testing for toString - negative number: " + toString2.toString() + "\n");
		
		try {
			HugeInteger toString3 = new HugeInteger("123456asda7234289") ;
			System.out.println("Testing for toString - With letters: " + toString3.toString() + "\n\n" );
        }
        catch (IllegalArgumentException e){
        	System.out.println("Testing for toString - letters/symbols: " + e + "\n\n");
        }
		
		
		//ADD EASY
		
		HugeInteger a11 = new HugeInteger("-3333");
		HugeInteger b11 = new HugeInteger("-2222");
		System.out.println("add = " + a11.toPrint(a11.add(b11)) +"\n\n");
		
		//SUBTRACT EASY
		HugeInteger a8 = new HugeInteger("22222");
		HugeInteger b8 = new HugeInteger("22222");
		System.out.println("subtract = " + a4.toPrint(a8.subtract(b8)) +"\n\n");
		
		//compare easy
		HugeInteger compare9 = new HugeInteger("0") ;
		HugeInteger compare10 = new HugeInteger("-100") ;
		System.out.println("compare = " + compare9.compareTo(compare10)+"\n\n");
		
		
		//multiply easy
		HugeInteger mult7=new HugeInteger("-99") ;
		HugeInteger mult8=new HugeInteger("99") ;
		System.out.println("Multiply = " + mult5.toPrint(mult7.multiply(mult8)) +"\n");
		
	}
}



