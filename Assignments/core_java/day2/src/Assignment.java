class Assignment{
	public static void main(String [] args){
	
	Tank t1=new Tank(10);
	Tank t2=new Tank(20);
	System.out.println("1: t1 value: "+t1.getLevel());
	System.out.println("2: t2 value: "+ t2.getLevel());
	
	t1=t2;
	System.out.println("t1 level: " +t1.getLevel() + " t2 level: " + t2.getLevel());
	
	t1.setLevel(27);
	System.out.println("t1 value : " + t1.getLevel() + " t2 value: "+ t2.getLevel());
	
	t2.setLevel(t1.getLevel()+10);
     System.out.println("t1 level: " + t1.getLevel() + " t2 level: " + t2.getLevel());

	}

}