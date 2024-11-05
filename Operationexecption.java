public class Calculatrice {

	public static void main(String[] args) {
    	try {
        	Nombre n1 = new Nombre(5);  // OK
        	Nombre n2 = new Nombre("NonEntier");  // Déclenche l'exception InputMismatchException
        	Addition addition = new Addition(n1, n2);
        	System.out.println(addition.valeur());
    	} catch (InputMismatchException e) {
        	System.err.println("Erreur : " + e.getMessage());
    	}
	}
}

