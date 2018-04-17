package com.app.test;
 abstract class Test
{
	 public int ac = 10;
	 protected int ca = 20;
  public static void display()
  {
    System.out.println("static method");
  }
   public abstract void getName();
  // private abstract void getName1();
   protected abstract void getName2();
}
class Demo1 extends Test
{
	/*public static void display()
	{
		System.out.println("Hello 1");
	}*/

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("name : "+ac);
	}

	@Override
	protected void getName2() {
		// TODO Auto-generated method stub
		System.out.println("name2 : "+ca);
	}

	/*@Override
	void getName() {
		// TODO Auto-generated method stub
		 System.out.println("nirmal");
	}*/
}
public class Demo 
{
  public static void main(String args[]) 
  {
	  Demo1 b = new Demo1();
   // Demo1.display();
    b.getName();
    b.getName2();
    Test.display();
    //Test.display();
  }


}