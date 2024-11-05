public class Calculatrice {

	/**
 	* Méthode principale qui exécute un exemple de calcul.
 	*
 	* Dans cet exemple, trois nombres sont créés : 2, 3 et 17. Ensuite, une
 	* soustraction est effectuée entre 17 et 2, suivie d'une addition de 2 et 3.
 	* Enfin, le résultat de la division de la soustraction par l'addition est affiché.
 	*
 	* @param args les arguments de la ligne de commande (non utilisés dans cet exemple).
 	*/
	public static void main(String[] args) {
    	try {
        	Expression deux = new Nombre(2);
        	Expression trois = new Nombre(3);
        	Expression dixSept = new Nombre(17);

        	Expression s = new Soustraction(dixSept, deux);
        	Expression a = new Addition(deux, trois);
        	Expression d = new Division(s, a);

        	System.out.println(d + " = " + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3
    	} catch (Exception e) {
        	System.out.println("Une erreur est survenue : " + e.getMessage());
    	}
	}
}

