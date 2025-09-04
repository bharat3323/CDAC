import java.util.Scanner;
class PrintSeason {
public static void main(String[] args) {
	//1 Create Scanner class instace
	Scanner sc=new Scanner(System.in);
	boolean exit=false;
	while(!exit) {
		System.out.println("Enter month no , 1-12");
		switch(sc.nextInt()) {
			 case 11:
			 case 12 :
			 case 1 :
			 case 2 : System.out.println("Season : Winter");
			 break;
			  case 3:
			 case 4 :
			 case 5 :
			 case 6 : System.out.println("Season : Summer");
			 break;
			  case 7:
			 case 8 :
			 case 9 :
			 case 10 : System.out.println("Season : Monsoon");
			 break;
			 default : System.out.println("Invalid Month !!!!!!");
			 exit=true;
			 break;
			
		}
	}
	//close Scanner
	sc.close();
}
}