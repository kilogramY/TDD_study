package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.LCDDisplay;

public class LCDDisplayTest {

	@Test
	public void test() {
		assertEquals( "._.\n"
				+ "|.|\n"
				+ "|_|",LCDDisplay.display_(0));
		//fail("Not yet implemented");
	}

}
