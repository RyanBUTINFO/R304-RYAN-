import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NombreTest {
	@Test
	public void testValeur() {
    	Nombre nombre = new Nombre(5);
    	assertEquals(5, nombre.valeur(), "La valeur du nombre devrait être 5");
	}
}


Test de la classe Addition :

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
	@Test
	public void testValeurAddition() {
    	Nombre n1 = new Nombre(3);
    	Nombre n2 = new Nombre(4);
    	Addition addition = new Addition(n1, n2);
    	assertEquals(7, addition.valeur(), "La valeur de l'addition devrait être 7");
	}
}

