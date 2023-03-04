package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_case 
{
	@Test
	public void test1() 
	{
		assertEquals(6,calculator.add(3,3));
		assertEquals(8,calculator.add(2,6));
	}

	@Test
	public void test2() 
	{
		assertEquals(10,calculator.sub(30,20));
		assertEquals(2,calculator.sub(6,4));
	}
	
	@Test
	public void test3() 
	{
		assertEquals(50,calculator.mul(25,2));
		assertEquals(40,calculator.mul(10,4));
	}
	
	@Test
	public void test4() 
	{
		assertEquals(10,calculator.div(200,20));
		assertEquals(2,calculator.div(8,4));
	}
}
