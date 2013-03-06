package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuRevoirCellTest {
	
	AuRevoirCell cell = new AuRevoirCell();

	@Test
	public void testAuRevoir() {
		assertEquals("Au Revoir!", cell.ask("Au Revoir"));
	}
	
	@Test
	public void testNotAuRevoir() {
		assertEquals(null, cell.ask("caca"));
	}

}