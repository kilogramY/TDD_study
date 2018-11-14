package test;

import static org.junit.Assert.*;
import main.TDD_digit;
import main.TDD_romanNum;

import org.junit.Test;


public class roman {

	@Test
	public void display_of_zero() {
		
		assertEquals( "X",TDD_romanNum.convert(10));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_twentyseven() {
		
		assertEquals( "._.._.\n"
					+ "._|..|\n" 
					+ "|_...|",TDD_digit.display(27));
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_sixtytwo() {
		
		assertEquals( "._.._.\n"
					+ "|_.._|\n" 
					+ "|_||_.",TDD_digit.display(62));
		//fail("Not yet implemented");
	}
}
