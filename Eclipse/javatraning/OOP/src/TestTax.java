import java.util.Scanner;
// call new class that incluse main class and extends class Tax

public class TestTax {

	public static void main(String[] args) 
	{
		// made new class t in HEAP MEMORY
		int i;
		String s;
		Tax t = new Tax();
		
		
		t.dependents = 2;
		t.state = "NY";
		// call param 
		
		Scanner inPut = new Scanner(System.in);
		
		System.out.print("Put yours income:");
		t.grossInCome = inPut.nextDouble();
	
		double yourTax = t.calcTax();
		
		if (yourTax < 2400)
				{
				i = 0;	
				}
		else if(yourTax == 2400)
					{
					i = 1;
					}
		else 	{
				i = 2;
				}
	switch (i){
				case 0:
					System.out.println("Your Tax is small");
					break;
				case 1:
					System.out.println("Your Tax is so so");
					break;
				case 2:
					System.out.println("Your Tax is big");
					break;
				}
		
	
	
	Scanner inNJ = new Scanner(System.in);
	
	System.out.print("Did you from NJ (Y/N0):");
	s = inNJ.nextLine();
			if(s.charAt(0)== 'Y' ) 
					{
						NJTax njTax = new NJTax();
						yourTax = njTax.adJustStudents(yourTax);
						System.out.println("Your Tax is: " + yourTax);
					}
			else 	{
	
					System.out.println("Your Tax is: " + yourTax);
					}
	}
}


