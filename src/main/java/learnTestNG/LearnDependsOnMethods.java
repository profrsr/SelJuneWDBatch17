package learnTestNG;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test
	public void test1(){
		System.out.println("test1");
		throw new RuntimeException();		
	}	

	@Test(dependsOnMethods={"test1"})
	public void test2(){
		System.out.println("test2");
	}

	@Test(dependsOnMethods={"test2"})
	public void test3(){
		System.out.println("test3");				
	}


}
