import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
	@Test
	public void testValeurDivision() {
    	Nombre n1 = new Nombre(10);
    	Nombre n2 = new Nombre(2);
    	Division division = new Division(n1, n2);
    	assertEquals(5, division.valeur(), "La valeur de la division devrait être 5");
	}

	@Test
	public void testDivisionParZero() {
    	Nombre n1 = new Nombre(10);
    	Nombre n2 = new Nombre(0);
    	assertThrows(IllegalArgumentException.class, () -> new Division(n1, n2), "Une division par zéro devrait lever une IllegalArgumentException");
	}
}

