import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoustractionTest {
	@Test
	public void testValeurSoustraction() {
    	Nombre n1 = new Nombre(10);
    	Nombre n2 = new Nombre(4);
    	Soustraction soustraction = new Soustraction(n1, n2);
    	assertEquals(6, soustraction.valeur(), "La valeur de la soustraction devrait être 6");
	}
}

