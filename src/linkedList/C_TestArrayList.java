package linkedList;

//COLLECTION 2\C_TEST.java
import java.util.*;

public class C_TestArrayList {
	public static void main(String[] args) {
		// ArrayList liste_1 = new ArrayList ();
		ArrayList<Integer> liste_1 = new ArrayList<Integer>();
		liste_1.add(152);
		liste_1.add(154);
		//set valeur 
liste_1.set(0, 555);
		for (int i = 0; i < liste_1.size(); i++) {
			System.out.println("Element à l'index : " + i + " = " + liste_1.get(i));
		}
	}
}
/*
 * Element à l'index : 0 = 555 Element à l'index : 1 = 154
 */

//La classe ArrayList permet de créer des vecteurs (ou tableaux) dynamiques