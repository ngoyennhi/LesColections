package linkedList;

//COLLECTION 1\C_ TEST.java
import java.util.*;

public class C_Test {
	public static void main(String[] args) {
		List<Integer> liste_1 = new LinkedList<Integer>();
		// Integer est le type d'élément de la collection
		// ou LinkedList <Integer> liste_1 = new LinkedList<Integer> ();
		liste_1.add(152);
		liste_1.add(155);
		for (int i = 0; i < liste_1.size(); i++) {
			System.out.println("Element à l'index : " + i + " = " + liste_1.get(i));
		}
	}
}
/*
 * Après exécution : Element à l'index : 0 = 152 Element à l'index : 1 = 155
 */
//La classe LinkedList permet de créer des listes chaînées.
//Cette classe est idéale pour ajouter à la suite les uns des autres des éléments dans un ensemble ordonné