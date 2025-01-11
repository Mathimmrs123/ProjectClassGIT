package com.git;

public class ClassA {

	static int id =10;
	public void  m1() {
		id=20;
		System.out.println(id);
	}
	
	private void m2() {
		System.out.println("TAMILNADU");

	}
	
   public void m3() {
	   id=30;
	   System.out.println(id);
   }
   
   private void m4() {
	System.out.println("INDIA");
}
   
   private void m5() {
	   id=90;
	   System.out.println(id);
	   

}
   private void m6() {
	System.out.println("asianContent");

}
   public static void main(String[] args) {
	ClassA a=new ClassA();
	a.m1();
	a.m2();
	a.m3();
	a.m4();
	a.m5();
	a.m6();

}

}
