package businessTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;
import business.GestionePersona;

public class GestionePersonaTest {
	@Test
	public void testLogin() {
		GestionePersona gp = new GestionePersona();
		
		boolean esito = gp.login("ciaone", "0000");
		assertTrue("non funziona", esito == false);
	}

}
