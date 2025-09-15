package tester;

import java.time.LocalDate;

public class TestMe {
//GUESS the Output , along with memory diagram 
	//, how many objs marked for GC 
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2001, 10, 12);
		//date2=date3
		LocalDate date2 = test(date);
		System.out.println(date);//12
		System.out.println(date2);//22
	}//
	
	//d=date
	static LocalDate test(LocalDate d) {
		LocalDate date3 = d.plusDays(10);// 22
		System.out.println(date3);//22
		return date3;//date3
	}

}
