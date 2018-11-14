package test;

import static org.junit.Assert.*;
import main.TDD_digit;

import org.junit.Test;


public class digit {

	@Test
	public void display_of_zero() {
		
		assertEquals( "._.\n"
					+ "|.|\n"
					+ "|_|",TDD_digit.display(0));
		
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
