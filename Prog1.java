package com.training;
abstract  class meth1{
	abstract void printHello();
	public void printHey() {
		System.out.println("Heyyyyy");
	}
}

class Father{
	static String name;
	void show(String name) {
		
		System.out.println("this is super class "+name);
	}
}
class Son extends Father{
	void prints(String name2){
		System.out.println("this is sub class "+name);
		show(name2);
	}
}
 
class Demo1 extends meth1{

	@Override
	void printHello() {
		System.out.println("the implementation of abstract class");
		
	}
	
}

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth1 m1 = new Demo1();
		m1.printHey();
		

	}

}
