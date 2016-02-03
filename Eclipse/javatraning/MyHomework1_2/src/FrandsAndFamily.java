import java.util.Scanner;

public class FrandsAndFamily {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		do{
			System.out.println("\n Enter list price:");
			double listPrice = input.nextDouble();
			
			System.out.println("Enter discount %");
			int discount = input.nextInt();
			
			System.out.println("You'll discount :" + ((listPrice/100)*discount));
			
		} while(true);
		}

	

}
