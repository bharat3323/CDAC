package wrappers;

import java.util.Date;

public class TestWrapper {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(1234);//boxing
		int data=i1.intValue();//un boxing
		Character charClass=Character.valueOf('A');
		char ch=charClass.charValue();
		
		Integer i2=100;//auto boxing (int -> Interger)
		data=i1;//auto un boxing(Integer-> int)
		Boolean flag=true;//auto boxing
		Date d1=new Date();
	//	d1++;
		String s="testing....";
	//	s++;
		i2++;//auto un boxing ->inc -> auto boxing
		System.out.println(i2);//101  , toString : Integer
		data=++i2;
		System.out.println(data);
		Integer i3=100;
		Integer i4=100;
		System.out.println(i3==i4);//t
		Integer i5=128;
		Integer i6=128;
		System.out.println(i5==i6);//f
		double d=12.34f; //widening (float->double)
	//	Double d2= 12.34f;//float --> Float ---X--- can't up casted to Double 
		//try it out - long ---> float : works ! , long ---> Float
		Double d2= (double) 12.34f;
		Number n1=1234.45F;//float --> Float(auto boxing) 
		//---> up casting --> Number
		System.out.println(n1.getClass());
		n1=12345;
		System.out.println(n1.getClass());
		Object o=1234.5678;//double -> Double -> Object
		o=false;

	}

}
