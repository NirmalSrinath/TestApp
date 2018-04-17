package com.app.test;
class TestInheritance{  
	public static void main(String args[]){  
		Dog1 d=new Dog1();  
		d.getName(); 
		d.getName2();  
	}
} 
class Animal{  
	void eat(){
		String sd = "12345";
		sd.charAt(1);
		System.out.println("lll   "+sd.toCharArray());
		char[] sc = sd.toCharArray();
		for(char sg:sc){
			System.out.println("eating..."+sg);
		}
		System.out.println("eating..."+sc.toString());
	} 
	
	int eat(int i){
		String sd = "12345";
		sd.charAt(1);
		System.out.println("lll   "+sd.toCharArray());
		char[] sc = sd.toCharArray();
		for(char sg:sc){
			System.out.println("eating..."+sg);
		}
		System.out.println("eating..."+sc.toString());
		return i;
	}  
}  
class Dog extends Animal{  
	int bark(){
		System.out.println("barking...");
		return 0;
	}  
} 
class Dog1 extends Test{  
	int bark(){
		System.out.println("barking...");
		return 0;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("getname");
		
	}

	@Override
	protected void getName2() {
		// TODO Auto-generated method stub
		System.out.println("getname1");
	}  
} 