package test;

import static org.junit.Assert.*;
import main.RomanNumConvert_Alex;

import org.junit.Test;


public class roman {

	@Test
	public void convert_500() {
		
		assertEquals( "D",RomanNumConvert_Alex.convert(500));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void convert_650() {
		
		assertEquals( "DCL",RomanNumConvert_Alex.convert(650));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void convert_4999() {
		
		assertEquals( "MMMMCMXCIX",RomanNumConvert_Alex.convert(4999));
		
		//fail("Not yet implemented");
	}
	
}
