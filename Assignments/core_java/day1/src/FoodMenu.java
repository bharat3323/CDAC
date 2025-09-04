import java.util.Scanner;


class FoodMenu{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		final int dosa = 60;
		final int idli = 30;
		final int samosa = 20;
		
		double total=0;
		
		
		do{
			
			System.out.println("------Food Menu------");
			System.out.println("1. Dosa  |  2. Idli  |  3. Samosa  |  4. Generate Bill  ");
			System.out.println("Enter your choice: ");
			
			int ch = sc.nextInt();
			
			switch(ch){
				
				
				case 1: 
					
					int dQuant=0;
					
					System.out.println("Quantity of Dosas: ");
					dQuant = sc.nextInt();
					
					total = total+ (dosa*dQuant);
					
					break;
				case 2: 
				
					int iQuant=0;
					
					System.out.println("Quantity of Idli: ");
					iQuant = sc.nextInt();
					
					total = total+ (idli*iQuant);
					
					break;
				case 3: 
					
					int sQuant=0;
					
					System.out.println("Quantity of Samosas: ");
					sQuant = sc.nextInt();
					
					total = total+ (samosa*sQuant);
					
					break;
				case 4: 
				
					total = total + total*(0.18);
					
					System.out.println("Total amount (with 18% GST) : " + total );
						
					exit = true;
					break;
					
				default: 
					
					System.out.println("Invalid Choice! Please enter between 1 to 4. ");
					
					break;
			}
			
			
		}while(!exit);
		
		sc.close();
	}

}