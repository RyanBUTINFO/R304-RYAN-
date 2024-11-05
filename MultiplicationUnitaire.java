import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {
	@Test
	public void testValeurMultiplication() {
    	Nombre n1 = new Nombre(5);
    	Nombre n2 = new Nombre(4);
    	Multiplication multiplication = new Multiplication(n1, n2);
    	assertEquals(20, multiplication.valeur(), "La valeur de la multiplication devrait être 20");
	}
}

