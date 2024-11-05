import java.util.InputMismatchException;

public class Nombre extends Expression {

	private int valeurNombre;

	public Nombre(Object valeur) {
    	if (!(valeur instanceof Integer)) {
        	throw new InputMismatchException("La valeur doit être un entier.");
    	}
    	this.valeurNombre = (int) valeur;
	}

	@Override
	public int valeur() {
    	return valeurNombre;
	}

	@Override
	public String toString() {
    	return String.valueOf(valeurNombre);
	}
}

