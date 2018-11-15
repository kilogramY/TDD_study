package test;

import static org.junit.Assert.*;
import main.LCDDisplay;
import main.RomanNumConvert_Alex;
import main.RomanNumConvert_gy;

import org.junit.Test;


public class roman_2 {

	@Test
	public void convert_300() {
		
		assertEquals( "CCC",RomanNumConvert_gy.convert(300));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void convert_8() {
		
		assertEquals( "VIII",RomanNumConvert_gy.convert(8));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void convert_9() {
		
		assertEquals( "IX",RomanNumConvert_gy.convert(9));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void convert_4999() {
		
		assertEquals( "CCCCXCIX",RomanNumConvert_gy.convert(4999));
		
		//fail("Not yet implemented");
	}
}
