package jbK_15_Oct_2024;

import org.testng.annotations.Test;

public class Grouping {
 
	@Test(priority=1, groups="smoke")
	void display(){ 
		System.out.println("This is an first Test case");
	}
	@Test(priority=2, groups="smoke")
   void show() {
		System.out.println("This is an Second Test case");
  }
	@Test(priority=3, groups="smoke")
	   void cat() {
			System.out.println("This is an Third Test case");
	  }
	@Test(priority=3, groups="smoke")
	   void monkey() {
			System.out.println("This is an Fourth Test case");
	  }
	@Test(priority=3, groups="smoke")
	   void elephent() {
			System.out.println("This is an Fifth Test case");
	  }
	@Test(priority=3, groups="smoke")
	   void dog() {
			System.out.println("This is an Fifth Test case");
	  }
}


