package com.git;

public class ClassA {

	static int id =10;
	public void  m1() {
		id=20;
		System.out.println(id);
	}
	
   public void m3() {
	   id=30;
	   System.out.println(id);
   }
   public static void main(String[] args) {
	ClassA a=new ClassA();
	a.m1();
	a.m3();

}

}
