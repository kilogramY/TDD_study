package test;

import static org.junit.Assert.*;
import main.LCDDisplay;

import org.junit.Test;


public class digit {

	@Test
	public void display_of_zero() {
		
		assertEquals( "._.\n"
					+ "|.|\n"
					+ "|_|",LCDDisplay.display(0));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_twentyseven() {
		
		assertEquals( "._.._.\n"
					+ "._|..|\n" 
					+ "|_...|",LCDDisplay.display(27));
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_sixtytwo() {
		
		assertEquals( "._.._.\n"
					+ "|_.._|\n" 
					+ "|_||_.",LCDDisplay.display(62));
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_X() {
		
		assertEquals( "._.._.\n"
					+ "|_.._|\n" 
					+ "|_||_.",LCDDisplay.display(12345));
		//fail("Not yet implemented");
	}
	
	@Test
	public void display_of_XX() {
		
		assertEquals( "._.._.\n"
					+ "|_.._|\n" 
					+ "|_||_.",LCDDisplay.display(395));
		//fail("Not yet implemented");
	}
}
