// call new class Tax
public class Tax {
//class Tax have 3 parametres
	
	double grossInCome;
	String state;
	int dependents;
	
// class Tax include 1 methods
	
	public double calcTax(){
	
		if (grossInCome<50000){
		
		return grossInCome*0.06;
		}	
	else {
		return grossInCome*0.08;
		}	
		
	}
}
